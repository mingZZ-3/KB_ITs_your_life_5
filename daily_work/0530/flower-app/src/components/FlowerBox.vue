<template>
    <div class="container text-center p-3">
      <h4>꽃 이름</h4><br>
      <input class="text-center" type="text" v-model="flowerName"><br>
      <h4>꽃 가격</h4><br>
      <input class="text-center" type="text" v-model.number="price"><br>
      <h4>꽃 수량</h4><br>
      <input class="text-center" type="text" v-model.number="cnt"><br>
    </div>
</template>

<script setup>
import {ref, defineModel, watch} from 'vue';

const info = defineModel();
const flowerName = ref('');
const price = ref(0);
const cnt = ref(0);

watch([flowerName, price, cnt], ([currntN, currentP, currentC], [oldN, oldP, oldC]) => {
    info.value = `${currntN}의 가격은 ${currentP * currentC}원 입니다.`;
});

</script>