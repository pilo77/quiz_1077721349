<template>
    <ion-page>
        <NavBarComponent></NavBarComponent>
        
      <ion-content>       
        <div id="login-container">  
          <div id="login-form">
            <InputComponent id="id" name="id" type="hidden"/>
            <InputComponent id="primerNombre" name="primerNombre" label="Primer Nombre:  " />
            
            <InputComponent id="segundoNombre" name="segundoNombre" label="Segundo Nombre: " />

            <InputComponent id="primerApellido" name="primerApellido" label="Primer Apellido:  " />
            
            <InputComponent id="segundoApellido" name="segundoApellido" label="Segundo Apellido: " />

             <InputComponent id="tipoDocumento" name="tipoDocumento" label="Tipo Documento: " />

            <InputComponent type="number" id="Documento" name="Documento" label="Documento: " />
            
            
          </div>
  
          <div> 
             <!--Traer el componente de los botones de la crud  -->
            <CrudButtonComponent />
          </div>         
        </div>
      </ion-content>
      
    </ion-page>
    
  </template>
  
  <script setup lang="ts">
  import { IonContent, IonPage } from '@ionic/vue';
  import InputComponent from '@/components/InputComponent.vue';
  import CrudButtonComponent from '@/components/CrudButtonComponent.vue';
  import NavBarComponent from './NavBarComponent.vue';
  </script>
  
  <style scoped src="../theme/container.css"></style>