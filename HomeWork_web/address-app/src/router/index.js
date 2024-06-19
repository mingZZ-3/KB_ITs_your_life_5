import { createRouter, createWebHistory } from "vue-router";
import Home from '@/pages/Home.vue'
import BoardList from '@/pages/Board_list.vue'
import BoardCreate from '@/pages/Board_create.vue'
import BoardUpdate from '@/pages/Board_update.vue'

const router = createRouter({
    history : createWebHistory(),
    routes : [
        {path: '/', name: "Home", component : Home},
        {path: '/boardList', name: "BoardList", component : BoardList},
        {path: '/boardCreate', name: "BoardCreate", component : BoardCreate},
        {path: '/boardUpdate/:id', name: "BoardUpdate", component : BoardUpdate}
    ]
});

export default router;