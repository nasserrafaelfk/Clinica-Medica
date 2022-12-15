<template>
  <v-container>
    <dataflix-app></dataflix-app>
    <v-form v-model="valid">
      <v-row class="my-10"></v-row>
      <v-card class="mx-auto my-12" max-width="500">
        <v-row class="mx-auto">
          <v-col>
            <v-text-field v-model="cadastro.nome" :rules="nomeRules" :counter="50" label="Nome" required>
            </v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field v-model="cadastro.senha" :rules="mandatoryRules" label="Senha" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.email" :rules="mandatoryRules" label="E-mail" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.telefone" :rules="mandatoryRules" label="Telefone" placeholder="(xx)99999-9999" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.cep" :rules="mandatoryRules" label="CEP" placeholder="33333-333" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.logradouro" :rules="mandatoryRules" label="Logradouro"
              required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.bairro" :rules="mandatoryRules" label="Bairro" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.cidade" :rules="mandatoryRules" label="Cidade" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.estado" :rules="mandatoryRules" label="Estado" placeholder="MG" required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.inicio" :rules="mandatoryRules" label="Início de contrato" placeholder="DD/MM/AAAA"
              required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.salario" :rules="mandatoryRules" label="Salário" placeholder="R$xxxx,xx"
              required></v-text-field>
          </v-col>
        </v-row>
        <v-row class="ml-3">
            <v-checkbox
              color="primary"
            >
              <template v-slot:label>
                <div @click.stop="">
                  Médico
                </div>
              </template>
            </v-checkbox>
          </v-row>
          <v-row class="mx-auto">
                    <v-col>
                        <v-select :items="especialidades" label="Especialidade médica">
                        </v-select>
                    </v-col>
                </v-row>
        <v-row class="mx-auto">
          <v-col>
            <v-text-field class="" v-model="cadastro.salario" :rules="mandatoryRules" label="CRM" placeholder="123456-MG"
              required></v-text-field>
          </v-col>
        </v-row>
        <v-row>
          <v-col class="text-center">
            <v-btn class="mr-auto" color="primary" elevation="2" large raised @click="register">
              Cadastrar
            </v-btn>
            <v-btn class="mx-auto ml-7" type="button" variant="outline-secondary" large @click="retornar">
              Retornar
            </v-btn>
          </v-col>
        </v-row>
      </v-card>
    </v-form>
    <v-snackbar v-model="snackbar">
      {{ text }}

      <template v-slot:action="{ attrs }">
        <v-btn color="pink" text v-bind="attrs" @click="snackbar = false">
          Close
        </v-btn>
      </template>
    </v-snackbar>
  </v-container>
</template>
<script lang="ts">
import Vue from 'vue'
import Vuetify from 'vuetify/lib'
import DataflixApp from '@/components/DataflixApp.vue'
import axios from 'axios'

export default Vue.extend({
  name: 'FormCadastro',
  components: {
    DataflixApp
  },
  data: () => ({
    especialidades: ["Cardiologia", "Neurologia", "Oncologia", "Homeopatia"],
    urlCadastro: 'http://localhost:8080/api/cadastro/',
    valid: false,
    cadastro: { nome: '', email: '', senha: '', telefone: '', cep: '', logradouro: '', cidade: '', estado: '', bairro: '', inicio: '', salario: '' },
    retorno: {},
    nomeRules: [
      (v: any) => !!v || 'Nome é obrigatório',
      (v: string | any[]) => v.length <= 50 || 'Nome deve conter no máximo 50 caracteres',
    ],
    mandatoryRules: [
      (v: any) => !!v || 'É obrigatório',
    ],
    emailRules: [
      (v: any) => !!v || 'E-mail é obrigatório',
      (v: string) => /.+@.+/.test(v) || 'E-mail inválido',
    ],
    snackbar: false,
    text: '',
    cadastroRetorno: {
      nome: "",
      email: "",
      senha: "",
      planoIsAtivo: false,
      tipoPlanoId: null
    }
  }),
  methods: {
    clear() {
      this.cadastro.nome = '', this.cadastro.email = '', this.cadastro.senha = '', this.cadastro.telefone = '', this.cadastro.cep = '', this.cadastro.logradouro = '',
      this.cadastro.cidade = '', this.cadastro.estado = '', this.cadastro.bairro = '', this.cadastro.inicio = '', this.cadastro.salario = ''
    },
    retornar() {
      this.$router.push('/home')
    },
    register() {
      axios
        .post(this.urlCadastro, this.cadastro)
        .then((res) => {
          this.cadastroRetorno = res.data;
          this.text = 'Cadastro feito com sucesso!';
          this.snackbar = true;
          this.$router.push('/home')
        }).catch((error) => {
          this.text = 'Erro ao realizar cadastro!';
          this.snackbar = true;
          console.log(error);
        });
    }
  }

})
</script>