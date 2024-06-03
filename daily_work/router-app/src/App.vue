<template>
  <div class="container text-center">
    <Header/>
    <router-view></router-view>
  </div>
</template>


<script setup>
import Header from './components/Header.vue'
import { provide } from 'vue';

provide('videos', [
  { "id":"Q3K0TOvTOno", "title":"How Sweet", "category":"official" },
  { "id":"ft70sAYrFyY", "title":"Bubble Gum", "category":"official" },
  { "id":"UagOXpNCc10", "title":"Right now", "category":"teaser" },
  { "id":"kcelgrGY1h8", "title":"New Jeans", "category":"official" },

]);
</script>


<style>
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css");
.container { text-align: center; margin-top:10px; }
.fa { padding: 5px; width: 30px; text-align: center;
    text-decoration: none; margin: 5px 2px; }
.fa-facebook { background: #3B5998; color: white; }
.fa-youtube { background: #BB0000; color: white; }
.fa-instagram { background: #125688; color: white; }
</style>