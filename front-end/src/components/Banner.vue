<template>
  <v-container>
    <dataflix-app></dataflix-app>
    <div id="main-banner">
    </div>
  </v-container>
</template>
  
<script lang="ts">
import Vue from 'vue'
import DataflixApp from '@/components/DataflixApp.vue'
export default Vue.extend({
  name: 'Banner',
  components: {
    DataflixApp
  }
})
</script>
  
<style scoped>
#main-banner {
  background-image: url('https://blog.imedicina.com.br/wp-content/uploads/2017/09/iStock-1136865476.jpg');
  background-position: 0 -250px;
  background-size: cover;
  height: 500px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
}

#main-banner h1 {
  color: #FFF;
  text-align: center;
  font-size: 60px;
  background-color: #222;
  padding: 20px 40px;
}
</style>