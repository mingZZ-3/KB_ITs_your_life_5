<template>
  <div style="background-color: bisque; width: 400px; height: 300px; align-content: center;">
    <Person v-model="info"/>
    <br>
    {{ info }}
  </div>
</template>

<script setup>
import {ref} from 'vue'
import Person from './components/Person.vue'

const info = ref('');
</script>