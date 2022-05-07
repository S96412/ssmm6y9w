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
    import ziyuanleixing from '@/views/modules/ziyuanleixing/list'
    import juanzengfang from '@/views/modules/juanzengfang/list'
    import xuqiuxinxi from '@/views/modules/xuqiuxinxi/list'
    import zaixianjuanzeng from '@/views/modules/zaixianjuanzeng/list'
    import shouzengfang from '@/views/modules/shouzengfang/list'
    import leixingzongshu from '@/views/modules/leixingzongshu/list'
    import juanzengzongshu from '@/views/modules/juanzengzongshu/list'
    import config from '@/views/modules/config/list'


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
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/ziyuanleixing',
        name: '资源类型',
        component: ziyuanleixing
      }
      ,{
	path: '/juanzengfang',
        name: '捐赠方',
        component: juanzengfang
      }
      ,{
	path: '/xuqiuxinxi',
        name: '需求信息',
        component: xuqiuxinxi
      }
      ,{
	path: '/zaixianjuanzeng',
        name: '在线捐赠',
        component: zaixianjuanzeng
      }
      ,{
	path: '/shouzengfang',
        name: '受赠方',
        component: shouzengfang
      }
      ,{
	path: '/leixingzongshu',
        name: '类型总数',
        component: leixingzongshu
      }
      ,{
	path: '/juanzengzongshu',
        name: '捐赠总数',
        component: juanzengzongshu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
