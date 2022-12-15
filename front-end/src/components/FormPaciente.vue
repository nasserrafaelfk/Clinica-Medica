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
                        <v-text-field class="" v-model="cadastro.email" :rules="mandatoryRules" label="E-mail"
                            required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.telefone" :rules="mandatoryRules" label="Telefone"
                            placeholder="(xx)99999-9999" required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.cep" :rules="mandatoryRules" label="CEP"
                            placeholder="33333-333" required></v-text-field>
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
                        <v-text-field class="" v-model="cadastro.bairro" :rules="mandatoryRules" label="Bairro"
                            required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.cidade" :rules="mandatoryRules" label="Cidade"
                            required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.estado" :rules="mandatoryRules" label="Estado"
                            placeholder="MG" required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.peso" :rules="mandatoryRules" label="Peso"
                            placeholder="xx.x (kg)" required></v-text-field>
                    </v-col>
                </v-row>
                <v-row class="mx-auto">
                    <v-col>
                        <v-text-field class="" v-model="cadastro.altura" :rules="mandatoryRules" label="Altura"
                            placeholder="x.xx (m)" required></v-text-field>
                    </v-col>
                </v-row>

                <v-row class="mx-auto">
                    <v-col>
                        <v-select :items="tipo" label="Tipo sanguíneo">
                        </v-select>
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
        tipo: ["A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"],
        urlCadastro: 'http://localhost:8080/api/cadastropaciente/',
        valid: false,
        cadastro: { nome: '', email: '', senha: '', telefone: '', cep: '', logradouro: '', cidade: '', estado: '', bairro: '', peso: '', altura: '' },
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
            this.cadastro.nome = '', this.cadastro.email = '', this.cadastro.telefone = '', this.cadastro.cep = '', this.cadastro.logradouro = '',
                this.cadastro.cidade = '', this.cadastro.estado = '', this.cadastro.bairro = '', this.cadastro.peso = '', this.cadastro.altura = ''
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