<template>
  <v-container>
    <v-app-bar absolute color="primary" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-app-bar-title>Health Clinic</v-app-bar-title>
      <v-spacer></v-spacer>
      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>
      <v-btn icon>
        <v-icon>mdi-dots-vertical</v-icon>
      </v-btn>
    </v-app-bar>
    <v-navigation-drawer v-model="drawer" absolute temporary>
      <v-list-item>
        <v-list-item-avatar>
          <v-img src="https://randomuser.me/api/portraits/men/42.jpg"></v-img>
        </v-list-item-avatar>

        <v-list-item-content>
          <v-list-item-title>{{ usuarioRetorno.nome }}</v-list-item-title>
        </v-list-item-content>
      </v-list-item>

      <v-divider></v-divider>

      <v-list dense>
        <v-btn depressed :to="'/home/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Home</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>

        <v-btn depressed :to="'/login/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-account</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Login</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>

        <v-btn depressed :to="'/cadastro/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-key</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Cadastro Funcionário</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>

        <v-btn depressed :to="'/cadastropaciente/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-key</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Cadastro Paciente</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>

        <v-btn depressed :to="'/fotos/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-pinwheel</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Fotos</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>

        <v-btn depressed :to="'/agendamento/'">
          <v-list-item>
            <v-list-item-icon grid>
              <v-icon>mdi-form-select</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Agendamento</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-btn>
      </v-list>
    </v-navigation-drawer>
  </v-container>
</template>

<script lang="ts">
import Vue from 'vue'
import axios from "axios";

export default Vue.extend({
  name: 'DataflixApp',
  data: () => ({
    drawer: false,
    urlUsuario: "http://localhost:8080/api/usuario/",
    usuarioRetorno: {
      id: 0,
      nome: "",
      email: "",
      senha: "",
      planoIsAtivo: false,
      tipoPlanoId: 0
    }
  }),
  methods: {
    BuscarUsuario() {
      axios
        .get(this.urlUsuario + this.$route.params.id)
        .then((res) => {
          this.usuarioRetorno = res.data;
          console.log(this.usuarioRetorno);
        }).catch((error) => {
          console.log(error);
        });
    }
  },
  watch: {
    group() {
      this.drawer = false
    },
  },
  mounted() {
    this.BuscarUsuario();
  }
})
</script>