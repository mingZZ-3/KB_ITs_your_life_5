import { createApp } from 'vue'
import 'bootstrap/dist/css/bootstrap.css'
import router from './router'
import { createPinia } from 'pinia' 
import App from './App.vue'

const pinia = createPinia();
const app = createApp(App);

app.use(router).use(pinia).mount('#app')
