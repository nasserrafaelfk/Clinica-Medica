<template>
    <v-container>
        <dataflix-app></dataflix-app>
        <div id="footer">
            <p>Health Clinical &copy; 2021</p>
        </div>
    </v-container>
  </template>
  
  <script lang="ts">
    import Vue from 'vue'
    import DataflixApp from '@/components/DataflixApp.vue'
    export default Vue.extend({
    name: "Footer",
    components:{
        DataflixApp
    }
  })
  </script>
  
  <style scoped>
    #footer {
      height: 100px;
      background-color: #222;
      border-top: 4px solid #111;
      color: #259bfc;
      display: flex;
      align-items: center;
      justify-content: center;
      bottom: 0;
      width: 100%;
    }
  </style>