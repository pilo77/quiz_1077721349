import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import HomePage from '../views/HomePage.vue'
import ClientePage from '../views/ClientePage.vue'
import LoginPage from '../views/LoginPage.vue'
import DasboardPage from '../views/DasboardPage.vue'
import ProductoPage from '@/views/ProductoPage.vue';
import PaisPage from '@/views/PaisPage.vue';
import CiudadPage from '@/views/CiudadPage.vue';
import DepartamentoPage from '@/views/DepartamentoPage.vue';

import Estudiantepage from '@/views/Estudiantepage.vue';
import EmpledoPage from '@/views/EmpledoPage.vue';

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    redirect: "/home",
  },
  {
    path: "/home",
    name: "Home",
    component: HomePage,
  },
  {
    path: "/cliente",
    name: "Cliente",
    component: ClientePage,
  },
  {
    path: "/login",
    name: "Login",
    component: LoginPage,
  },
  {
    path: "/dashboard",
    name: "Dashboard",
    component: DasboardPage,
  },
  {
    path: "/producto",
    name: "Producto",
    component: ProductoPage,
  },
  {
    path: "/pais",
    name: "Pais",
    component: PaisPage,
  },
  {
    path: "/ciudad",
    name: "Ciudad",
    component: CiudadPage,
  },
  {
    path: "/departamento",
    name: "Departamento",
    component: DepartamentoPage,
  },
  {
    path: "/empleado",
    name: "Empleado",
    component: EmpledoPage,
  },
  {
    path: "/estudiante",
    name: "Estudiante",
    component: Estudiantepage,
  },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
