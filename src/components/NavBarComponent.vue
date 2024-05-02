<template>
  
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Dashboard</ion-title>
      </ion-toolbar>
      <div id="container">
        
        <strong><a href="/producto">Ir a productos</a></strong>
        <br />
        <strong><a href="/pais">Ir a pais</a></strong>
        <br />
        <strong><a href="/ciudad">Ir a ciudad</a></strong>
        <br />
        <strong><a href="/departamento">Ir a departamento</a></strong>
        <br />
        <strong><a href="/empleado">Ir a empleado</a></strong>
          <br />
        <strong><a href="/estudiante">Ir a estudiante</a></strong>
        <br />
        <strong><a href="/cliente">Ir a Clientes</a></strong>
        
        
      </div>
    </ion-header>


</template>

<script setup lang="ts">
import {
  
  IonHeader,
  
  IonTitle,
  IonToolbar,
} from "@ionic/vue";
</script>

<style scoped></style>