import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussmeirituijian from '@/views/modules/discussmeirituijian/list'
    import meirituijian from '@/views/modules/meirituijian/list'
    import xiaoxi from '@/views/modules/xiaoxi/list'
    import huifu from '@/views/modules/huifu/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import discussyonghuxinxi from '@/views/modules/discussyonghuxinxi/list'
    import yonghuxinxi from '@/views/modules/yonghuxinxi/list'
    import users from '@/views/modules/users/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '交友论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '公告',
        component: news
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussmeirituijian',
        name: '每日推荐评论',
        component: discussmeirituijian
      }
      ,{
	path: '/meirituijian',
        name: '每日推荐',
        component: meirituijian
      }
      ,{
	path: '/xiaoxi',
        name: '消息',
        component: xiaoxi
      }
      ,{
	path: '/huifu',
        name: '回复',
        component: huifu
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussyonghuxinxi',
        name: '用户信息评论',
        component: discussyonghuxinxi
      }
      ,{
	path: '/yonghuxinxi',
        name: '用户信息',
        component: yonghuxinxi
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
