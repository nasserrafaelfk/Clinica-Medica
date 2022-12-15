import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import FormLogin from '../views/FormLogin.vue'
import FormCadastro from '../views/FormCadastro.vue'
import FormPaciente from '../components/FormPaciente.vue'
import Home from '../views/Home.vue'
import GridFotos from '../views/GridFotos.vue'
import Agendamento from '../components/Agendamento.vue'

Vue.use(VueRouter)

const routes: Array<RouteConfig> = [
  {
    path: '/login',
    name: 'login',
    component: FormLogin
  },
  {
    path: '/cadastro',
    name: 'cadastro',
    component: FormCadastro
  },
  {
    path: '/cadastropaciente',
    name: 'cadastropaciente',
    component: FormPaciente
  },
  {
    path: '/fotos',
    name: 'fotos',
    component: GridFotos
  },
  {
    path: '/home',
    name: 'home',
    component: Home
  },
  {
    path: '/agendamento',
    name: 'agendamento',
    component: Agendamento
  }
  
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
