
import {createRouter, createWebHistory, isNavigationFailure} from 'vue-router'
const Home = () => import(/* webpackChunkName: "home" */ '@/pages/Home.vue');
const About = () => import(/* webpackChunkName: "home" */ '@/pages/About.vue');
const Members = () => import(/* webpackChunkName: "members" */'@/pages/Members.vue');
const MemberInfo = () => import(/* webpackChunkName: "members" */'@/pages/MemberInfo.vue');
const Videos = () => import(/* webpackChunkName: "videos" */'@/pages/Videos.vue');
const VideoPlayer = () => import(/* webpackChunkName: "videos" */'@/pages/VideoPlayer.vue');

// 라우트 수준
const membersIdGuard = (to, from) => {
    if (from.name !== 'members' && from.name !== 'members/:id') {
        return false;
    }
};

const router = createRouter({
    history:createWebHistory(),
    routes : [

        {path : '/',  name: "home", component:Home},
        {path : '/about',  component:About,},
        {path : '/members',  component:Members,},
        {path : '/members/:id', name:'members/:id', component:MemberInfo,
            beforeRouteEnter : membersIdGuard,
        },
        { path: '/videos', component: Videos, 
            children : [
            { path:":id", component: VideoPlayer }]
        },
    ],
});

// 전역 수준
router.beforeEach((to, from) => {
    if (to.path == '/param') {
        return;
    }
    else if (to.path == '/home') {
        return '/';
    }
    else if (to.query && Object.keys(to.query).length > 0) { 
        return {path : to.path, query : {}, params: to.params};
    }
});


router.afterEach((to, from, failure)=> {
    if (isNavigationFailure(failure)) {
        console.log("@@ 내비게이션 중단 : ", failure)
        return { name:"home" };
    }
})


export default router;