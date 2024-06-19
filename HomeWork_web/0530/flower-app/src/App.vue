<template>
  <div class="container text-center text-bg-light p-3">
    <div class="fs-2 fw-bold text-center m-5 text-success">FLOWER ORDER</div>
    <FlowerBox v-model="info"/><br>

    <div v-show="isConfirmed">
      {{ info }}
    </div><br>

    <button @click="confirmOrder">주문</button><br><br>
    
    <div v-show="isConfirmed">
      <img style="width: 500px;" src="https://img.freepik.com/premium-photo/red-british-cat-sniffing-flowers_392339-1.jpg">
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import FlowerBox from './components/FlowerBox.vue'

const info = ref('');
const isConfirmed = ref(false);

const confirmOrder = () => {
  isConfirmed.value = !isConfirmed.value;
}
</script>