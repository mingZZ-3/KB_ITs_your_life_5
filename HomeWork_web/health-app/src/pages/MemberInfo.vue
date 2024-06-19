<template>
    <div>
        <h2 style="background-color: green;">Member Info</h2>
        회원 ID : {{ member.id }} <br>
        PW : {{ member.pw }} <br>
        이름 : {{ member.mname }} <br>
        주소 : <input type="text" v-model="member.address"><br>
        전화번호 : <input type="text" v-model="member.phonenum"><br>
        <button @click="editMyInfo">수정</button>
   </div>
</template>

<script setup>
import { useMemberStore } from '@/stores/member.js'
import { storeToRefs } from 'pinia'

const memberStore = useMemberStore();
const { member } = storeToRefs(memberStore);
const { editInfo } = memberStore;

const editMyInfo = (e) => {
    editInfo(member.value.address, member.value.phonenum);
}

</script>