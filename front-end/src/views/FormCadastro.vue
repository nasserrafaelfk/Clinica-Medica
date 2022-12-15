<template>
  <form-cadastro />
 </template>

<script lang="ts">
import Vue from 'vue'
import FormCadastro from '../components/FormCadastro.vue'
import DataflixApp from '@/components/DataflixApp.vue'

export default Vue.extend({
  name: 'Cadastro',

  components: {
    FormCadastro,
    DataflixApp
}
})
</script>
