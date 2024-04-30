<template>
  <ion-page>
    <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title>Estudiante</ion-title>
        </ion-toolbar>
      </ion-header> 
    <PersonaComponent></PersonaComponent>
  </ion-page>
</template>

<script setup lang="ts">
import PersonaComponent from "@/components/PersonaComponent.vue";
</script>
