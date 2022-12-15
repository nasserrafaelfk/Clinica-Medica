<template>
  <form-login />
</template>

<script lang="ts">
import Vue from 'vue'
import FormLogin from '../components/FormLogin.vue'

export default Vue.extend({
  name: 'Login',

  components: {
    FormLogin
  }
})
</script>
