<template>
    <div class="container p-5">
        <span class="fs-1 border border-warning-subtle rounded-3 border-5 p-3">KB 길찾기</span>
        <div>
            <nav class="navbar navbar-expand-md navbar-light mt-2">
                <button class="navbar-toggler" type="button" @click="changeIsNavShow">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div :class="navClass">
                    <ul class="navbar-nav"> 
                        <li class="nav-item">
                            <router-link class="nav-link" to="/">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-3u8zG-ybZL5y568torZzu-l2ETwaF3Crpg&s">
                            </router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/bus">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVl_PQH3x0I5tYRPSyfgvAgS0MqRKzHNtGmQ&s">
                            </router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/walk">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpNo_V9g_PSUugXvicLcfdwJ1jst5F6vlOPA&s">
                            </router-link>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</template>

<script setup>
import { reactive, computed } from 'vue';
import { RouterLink } from 'vue-router';

const state = reactive({ isNavShow: false });

const navClass = computed(() => state.isNavShow
    ? "collapse navbar-collapse show" : "collapse navbar-collapse")

const changeIsNavShow = () => {
    state.isNavShow = !state.isNavShow;
};
</script>