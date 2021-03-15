import Vue from 'vue';
import VueRouter from 'vue-router';
import Content from '../components/Content'
//安装路由
Vue.use(VueRouter);

export default new VueRouter({
   routes:[
       {
           //路由路径
        path: '/content',
        name: 'content',
           //跳转的组件
        component: Content
       }
   ]
});