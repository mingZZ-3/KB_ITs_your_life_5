<template>
  <div>
    콘솔을 확인하세요.
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPT = () => {
  const url = "/api/todolist/gdhong";
  axios
  .get(url)
  .then((response) => {
    console.log("# 응답객체 : ", response.data);
  });
}

requestAPT();
</script>