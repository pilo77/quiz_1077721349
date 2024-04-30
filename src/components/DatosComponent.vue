<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title>Datos</ion-title>
        </ion-toolbar>
          <div id="container">
        <strong><a href="/pais">Ir a pais</a></strong>
        <br>
        <strong><a href="/ciudad">Ir a ciudad</a></strong>
        <br>
        <strong><a href="/departamento">Ir a departamento</a></strong>

      </div>
      </ion-header>  
      <ion-content>       
        <div id="login-container">  
          <div id="login-form">
            <InputComponent id="id" name="id" type="hidden"/>
            <InputComponent id="codigoDane" name="codigoDAne" label="Código Dane: " />
            
            <InputComponent id="nombre" name="nombre" label="nombre: " />
            
            <InputComponent type="number" id="stock" name="stock" label="Stock: " disabled="disabled" />
          </div>
  
          <div> 
             <!--Traer el componente de los botones de la crud  -->
            <CrudButtonComponent />
          </div>         
        </div>
      </ion-content>
      <ion-content>
      <br>
    

    </ion-content>
    </ion-page>
    
  </template>
  
  <script setup lang="ts">
  import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  import InputComponent from '@/components/InputComponent.vue';
  import CrudButtonComponent from '@/components/CrudButtonComponent.vue';
  </script>
  
  <style scoped src="../theme/container.css"></style>