<template>
    <Header/>
    <!-- Suspense : 비동기 처리(setup)가 있을 경우, 로딩 처리를 위한 내장 컴포넌트 -->
    <!-- https://ko.vuejs.org/guide/built-ins/suspense -->
    <!-- v-slot : 외부에서 주입해야 할 컴포넌트 -->
    <!-- router-view : 라우팅이 되는 실제 영역 -->
    <router-view v-slot="{ Component }">
      <Suspense timeout="0">
        <!-- 비동기 처리가 없거나 끝났을때 나오는 컴포넌트 -->
        <Component :is="Component"></component>
        <!-- template #fallback : 비동기 처리 중일때 나올 페이지-->
        <template #fallback>
          <Loading/>
        </template>
      </Suspense>
    </router-view>
</template>

<script setup>
import Header from '@/components/Header.vue'
import Loading from '@/components/Loading.vue'
import { provide } from 'vue';

provide('videos', [
{ "id":"Q3K0TOvTOno", "title":"How Sweet", "category":"official" },
  { "id":"ft70sAYrFyY", "title":"Bubble Gum", "category":"official" },
  { "id":"UagOXpNCc10", "title":"Right now", "category":"teaser" },
  { "id":"kcelgrGY1h8", "title":"New Jeans", "category":"official" }
]);
</script>


<style>
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css");
.container { text-align: center; margin-top:10px; }
.fa { padding: 5px; width: 30px; text-align: center; 
    text-decoration: none; margin: 5px 2px; }
.fa-facebook { background: #3B5998; color: white; }
.fa-youtube { background: #bb0000; color: white; }
.fa-instagram { background: #125688; color: white; }
</style>