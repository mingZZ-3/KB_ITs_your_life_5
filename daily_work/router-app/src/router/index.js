import {createRouter, createWebHistory} from 'vue-router'
import Home from '@/pages/Home.vue'
import About from '@/pages/About.vue'
import Members from '@/pages/Members.vue'
import MemberInfo from '@/pages/MemberInfo.vue'
import Videos from '@/pages/Videos.vue'
import VideoPlayer from '@/pages/VideoPlayer.vue'
import NotFound from '@/pages/NotFound.vue'


const router = createRouter({
    history : createWebHistory(),
    routes : [
        { path : '/', name : 'home', component : Home },
        { path : '/about', component : About, },
        { path : '/members', component : Members, },
        { path : '/members/:id(\\d+)', component : MemberInfo, },
        { path: '/videos', component: Videos,
            children : [
                { path:":id", component: VideoPlayer }
            ]
        },
        { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFound },
    ],
});

export default router;