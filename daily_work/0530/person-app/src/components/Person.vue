<template>
    <div>
        name : <input type="text" v-model="mname"><br>
        x(키) : <input type="text" v-model.number="height"><br>
        y(몸무게) : <input type="text" v-model.number="weight"><br>
        <br>
        <button @click="showInfo">정보 표시</button>
    </div>
</template>

<script setup>
import { ref, defineModel } from 'vue'

const mname = ref('');
const height = ref(0);
const weight = ref(0);

const info = defineModel();

const showInfo = () => {
    info.value = `${mname.value}의 키는 ${height.value}cm, 몸무게는 ${weight.value}kg입니다.`;
};
</script>