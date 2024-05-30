<template>
  <div class="container text-center bg-primary">
    <YachtOrder @showPrice="showPrice"/><br>
    <div>요트 이전 계산 주문 가격 : {{ oldPrice }}</div><br>
    <div>요트 현재 계산 주문 가격 : {{ currentPrice }}</div><br>
    <div>가격 차이 : {{ currentPrice - oldPrice }}</div><br>
  </div>
</template>

<script setup>
import { ref, reactive } from 'vue';
import YachtOrder from './components/YachtOrder.vue';

const oldPrice = ref(0);
const currentPrice = ref(0);

const showPrice = (value) => {
  oldPrice.value = currentPrice.value;
  currentPrice.value = value[0] * value[1];
};

</script>