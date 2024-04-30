<template>
  <ion-page>
    <NavBarComponent></NavBarComponent>
    
    <ion-content>
      <div id="login-container">
        <div id="login-form">
          <InputComponent id="id" name="id" type="hidden" />
          <InputComponent
            id="codigoDane"
            name="codigoDAne"
            label="Código Dane: "
          />

          <InputComponent id="nombre" name="nombre" label="nombre: " />

          <InputComponent
            type="number"
            id="stock"
            name="stock"
            label="Stock: "
            disabled="disabled"
          />
        </div>

        <div>
          <!--Traer el componente de los botones de la crud  -->
          <CrudButtonComponent />
        </div>
      </div>
    </ion-content>
    <ion-content>
      <br />
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import {
  IonContent,
  IonHeader,
  IonPage,
  IonTitle,
  IonToolbar,
} from "@ionic/vue";
import InputComponent from "@/components/InputComponent.vue";
import CrudButtonComponent from "@/components/CrudButtonComponent.vue";
import NavBarComponent from "./NavBarComponent.vue";

</script>

<style scoped src="../theme/container.css"></style>
