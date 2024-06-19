<template>
    <div>
        <h3>요트 수량</h3>
        <input type="text" v-model.number="cnt"><br>

        <h3>요트 가격</h3>
        <input type="text" v-model.number="price"><br><br>
        <button @click="showPrice">요트 주문 가격 비교</button>
    </div>
</template>

<script setup>
import { ref, defineEmits } from 'vue';

const cnt = ref(0);
const price = ref(0);

const emit = defineEmits(['showPrice']);
const showPrice = () => {
    emit('showPrice', [cnt.value, price.value]);
};


</script>