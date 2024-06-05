<template>
    <div class="container">
        <h1 class="m-3">Board List</h1>
        <button type="button" class="btn btn-warning m-3">
            <router-link class="nav-link px-2 text-white" to="/boardCreate">
                Create New Post
            </router-link>
        </button>
        <br>

        <div class="container"> 
            <table class="table table-striped table-bordered table-hover"> 
                <thead> 
                    <tr class="table-dark text-white"> 
                        <th>번호</th> 
                        <th>이름</th> 
                        <th>이메일</th> 
                        <th>성별</th> 
                        <th>삭제</th> 
                        <th>수정</th> 
                    </tr> 
                </thead> 
                <tbody> 
                    <tr v-for="item in json" :key="item.id"> 
                        <td>{{ item.id }}</td> 
                        <td>{{ item.first_name }} {{ item.last_name }}</td>
                        <td>{{ item.email }}</td> 
                        <td>{{ item.gender }}</td>
                        <td><button class="btn btn-secondary" @click="deleteYouth(item.id)">삭제</button></td>
                        <td><button class="btn btn-secondary" @click="router.push(`/boardUpdate/${item.id}`)">수정</button></td>
                    </tr> 
                </tbody> 
            </table>
        </div>
    </div>
</template>

<script setup>
import { useRouter } from 'vue-router';
import axios from 'axios'
import { ref } from 'vue'

const router = useRouter();
const json = ref([]);

const youthListAPI = async () => {
    try {
        const response = await axios.get('/api/youth');

        if (response.status != 200 
            || !response.data || response.data.length == 0) {
                json.value = [];
                return;
        }

        json.value = response.data;
    } catch (error) {
        alert('에러 발생 !')
        console.log('error : ', error);
    }
}

const deleteYouth = async (id) => {
    try {
        console.log(id);
        const deleteURL = '/api/youth/' + String(id);
        const response = await axios.delete(deleteURL);

        console.log(response);

        if (response.status != 200) {
            alert('삭제 실패 ㅠ');
            return;
        }

        youthListAPI();
    } catch (error) {
        
    }
}

youthListAPI();
</script>