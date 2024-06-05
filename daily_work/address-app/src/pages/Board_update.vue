<template>
    <div class="container">
        <div class="px-5">
            <h1 class="mt-3 mb-3">Board Update</h1>
            <form name="form" class="needs-validation" novalidate @submit.prevent="submit" >
                <div class="row g-3">
                    <div class="col-sm-6">
                        <label for="firstName" class="form-label">First name</label>
                        <input v-model="firstName" @change="changeFirstName" type="text" class="form-control" id="firstName" placeholder="" value="" required>
                        <div :class="fName_class" class="text-danger">
                            이름을 입력해주세요
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <label for="lastName" class="form-label">Last name</label>
                        <input v-model="lastName" @change="changeLastName" type="text" class="form-control" id="lastName" placeholder="" value="" required>
                        <div :class="lName_class"  class="text-danger">
                            성을 입력해주세요
                        </div>
                    </div>

                    <div class="col-12">
                        <label for="email" class="form-label">Email <span
                                class="text-body-secondary"></span></label>
                        <input v-model="email" @change="changeEmail" type="email" class="form-control" id="email" placeholder="you@example.com">
                        <div :class="email_class" class="text-danger">
                            이메일을 입력해주세요
                        </div>
                    </div>

                    <div class="col-md-12">
                        <label for="gender" class="form-label">Gender</label>
                        <select v-model="gender" @change="changeGender" class="form-select" id="gender" required>
                            <option value="">Choose...</option>
                            <option>Male</option>
                            <option>Female</option>
                        </select>
                        <div :class="gender_class" class="text-danger">
                            성별을 입력해주세요
                        </div>
                    </div>

                  <div class="col-sm-2">
                    <button class="btn btn-success" type="submit" @click="update">Update</button>
                  </div>
                  <div class="col-sm-2">
                    <button class="btn btn-dark" type="reset" @click="cancle">
                        <router-link class="nav-link px-2 text-white" to="/boardList">Cancle</router-link>
                    </button>
                  </div>
              </div>
          </form>
    </div>
    </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import axios from 'axios'
import { RouterLink } from 'vue-router';
import { ref } from 'vue'

const updateId = useRoute().params.id;

const firstName = ref('');
const lastName = ref('');
const email = ref(null);
const gender = ref(null);

const fName_class = ref('invalid-feedback')
const lName_class = ref('invalid-feedback')
const email_class = ref('invalid-feedback')
const gender_class = ref('invalid-feedback')

const memberData = async () => {
    try {
        const memberURL = '/api/youth/' + updateId;
        const response = await axios.get(memberURL);

        if (response.status != 200 || !response.data) {
            alert('다시 로드해주세요 !');
            return;
        }

        firstName.value = response.data.first_name;
        lastName.value = response.data.last_name;
        email.value = response.data.email;
        gender.value = response.data.gender;
    } catch (error) {
        alert('에러 발생 !');
        console.log('error : ', error);
    }
}

const update = async () => {
    if (fName_class.value == 'invalid-feedback' && lName_class.value == 'invalid-feedback' 
            && email_class.value == 'invalid-feedback' && gender_class.value == 'invalid-feedback') {
        try {
            let data = {
                first_name : firstName.value,
                last_name : lastName.value,
                email : email.value,
                gender : gender.value
            }

            const updateURL = '/api/youth/' + updateId;
            const response = await axios.put(updateURL, data)

            console.log(response);
            if (response.status == 200) {
                alert('성공 ! 리스트로 돌아가 확인해보세요 :)');
            } else {
                alert('데이터 수정에 오류가 발생했습니다ㅠ');
            }
        } catch (error) {
            alert('에러 발생 !');
            console.log('error : ', error);
        }
    } else {
        alert('입력창을 모두 채워주세요 !');
    }
}

// 필수 입력 경고 이벤트
const changeFirstName = (e) => {
    if(firstName.value == ''){
        fName_class.value = '';
    }else{
        fName_class.value = 'invalid-feedback';
    }
}

const changeLastName = (e) => {
    if(lastName.value == ''){
        lName_class.value = '';
    }else{
        lName_class.value = 'invalid-feedback';
    }
}

const changeEmail = (e) => {
    let regex = /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;
    if(email.value && regex.test(email.value) == false){
        email_class.value = '';
    }else{
        email_class.value = 'invalid-feedback';
    }
}

const changeGender = (e) => {
    if(gender.value == ''){
        gender_class.value = '';
    }else{
        gender_class.value = 'invalid-feedback';
    }
}

memberData();
</script>