<template>
    <v-container>
        <dataflix-app></dataflix-app>
        <v-form v-model="valid">
            <v-row class="my-10"></v-row>
            <v-card class="mx-auto my-12" max-width="500">
                <v-row class="mx-auto">
                    <v-col>
                        <v-alert color="primary">
                            Escolha a data:
                        </v-alert>
                        <v-date-picker v-model="picker" full-width></v-date-picker>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-alert color="primary">
                            Escolha o horário:
                        </v-alert>
                        <v-time-picker ampm-in-title format="ampm" full-width required label="Escolha o horário">
                        </v-time-picker>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-alert class="mx-auto" color="primary">
                            Escolha a especialidade médica:
                        </v-alert>
                        <v-select :items="especialidades" label="Selecione">
                        </v-select>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-alert class="mx-auto" color="primary">
                            Escolha o médico especialista:
                        </v-alert>
                        <v-select :items="medicos" label="Selecione">
                        </v-select>
                    </v-col>
                </v-row>
                <v-row>
                    <v-col class="text-center">
                        <v-btn class="mr-auto" color="primary" elevation="2" large raised @click="register">
                            Agendar
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
    name: 'Agendamento',
    components: {
        DataflixApp
    },
    data: () => ({
        urlCadastro: 'http://localhost:8080/api/agendamento/',
        valid: false,
        user: { nome: '', senha: '', email: '' },
        medicos: ["Dr. Nasser Rafael", "Dr. Darmes Araújo", "Dr. Eduardo Campos"],
        especialidades: ["Cardiologia", "Neurologia", "Oncologia", "Homeopatia"],
        retorno: {},
        snackbar: false,
        text: '',
        usuarioRetorno: {
            nome: "",
            email: "",
            senha: "",
            planoIsAtivo: false,
            tipoPlanoId: null
        }
    }),
    methods: {
        clear() {
            this.user.email = ''
            this.user.nome = ''
            this.user.senha = ''
        },
        retornar() {
            this.$router.push('/home')
        },
        register() {
            axios
                .post(this.urlCadastro, this.user)
                .then((res) => {
                    this.usuarioRetorno = res.data;
                    this.text = 'Agendamento feito com sucesso!';
                    this.snackbar = true;
                    this.$router.push('/home')
                }).catch((error) => {
                    this.text = 'Erro ao realizar agendamento!';
                    this.snackbar = true;
                    console.log(error);
                });
        }
    }

})
</script>