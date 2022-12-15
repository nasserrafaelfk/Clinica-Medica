<template>
    <Agendamento />
</template>
  
<script lang="ts">
import Vue from 'vue'
import DataflixApp from '@/components/DataflixApp.vue'
import Agendamento from '@/components/Agendamento.vue';

export default Vue.extend({
    name: 'Agendamento',

    components: {
        DataflixApp,
        Agendamento
    }
})
</script>
  