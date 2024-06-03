import { createRouter, createWebHistory } from 'vue-router'
import Bike from '@/pages/BikeBox.vue'
import Bus from '@/pages/BusBox.vue'
import Walk from '@/pages/WalkBox.vue'

const router = createRouter({
    history:createWebHistory(),
    routes : [
        {path : '/', name : "bike", component : Bike},
        {path : '/bus', name : "bus", component : Bus},
        {path : '/walk', name : "walk", component : Walk},
    ],
});

export default router;