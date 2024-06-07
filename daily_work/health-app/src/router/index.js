import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/pages/MemberInfo.vue'
import PT from '@/pages/PTMemberInfo.vue'

const router = createRouter({
    history : createWebHistory(),
    routes : [
        {path : '/', component : Home },
        {path : '/pt', component : PT }
    ]
});

export default router;