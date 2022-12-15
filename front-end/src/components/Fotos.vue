<template>
    <v-container>
        <dataflix-app></dataflix-app>
        <v-row>
            <v-col v-for="n in 9" :key="n" class="d-flex child-flex" cols="4">
                <v-img :src="`${fotos[n-1]}`" aspect-ratio="1" cover class="bg-grey-lighten-2">
                    <template v-slot:placeholder>
                        <v-row class="fill-height ma-0" align="center" justify="center">
                            <v-progress-circular indeterminate color="grey-lighten-5"></v-progress-circular>
                        </v-row>
                    </template>
                </v-img>
            </v-col>
        </v-row>
    </v-container>
</template>
<script lang="ts">
import Vue from 'vue'
import DataflixApp from '@/components/DataflixApp.vue'
export default Vue.extend({
    name: 'Fotos',
    components: {
        DataflixApp
    },
    data: () => ({
        fotos:
            [
                "https://media.gettyimages.com/id/941762276/pt/foto/doctors-walking-in-clinic.jpg?s=2048x2048&w=gi&k=20&c=kyq3dDtCHF2BXH0mcqsCGxwSABqC3ASJfzYla1X7mTM=",
                "https://media.gettyimages.com/id/1244803401/pt/foto/empty-doctors-office.jpg?s=2048x2048&w=gi&k=20&c=Jqqx00HJsR7jXgeE5PTFr2R83imvjkX3zMIMgMVpqhk=",
                "https://media.gettyimages.com/id/1198823252/pt/foto/female-senior-doctor-welcoming-greeting-mother-and-daughter-at-hospital.jpg?s=2048x2048&w=gi&k=20&c=Pjhv8PnRypa1buK7uOjuaUYPW7d1jtxkyqs816GE64Y=",
                "https://media.gettyimages.com/id/1034426836/pt/foto/encouraging-therapist-talks-with-young-woman.jpg?s=2048x2048&w=gi&k=20&c=1Co5Iaod7HZwN29163BOQBgpMyftllv8dBwGtyRjMmY=",
                "https://media.gettyimages.com/id/1295775470/pt/foto/hospital-corridor.jpg?s=2048x2048&w=gi&k=20&c=fY-cRKbTfXZZZr3dCWq0wO_Q_olkzfmvkqZ_nofUG8A=",
                "https://media.gettyimages.com/id/1311267413/pt/foto/interior-design-architecture-computer-generated-image-of-a-hospital-architectural-visualization.jpg?s=2048x2048&w=gi&k=20&c=2jfRYEgAoSuo0ulgJmj7ouxOyxx4UbBoQMuWcnP7VDU=",
                "https://media.gettyimages.com/id/1342134434/pt/foto/caring-doctor-listens-to-patient.jpg?s=2048x2048&w=gi&k=20&c=JYZnf7ll4PsyLrYaAyun-iPfLPAFa60GlizbNI4lvZ0=",
                "https://media.gettyimages.com/id/1254899249/pt/foto/doctors-appointment.jpg?s=2048x2048&w=gi&k=20&c=xkR2LyeuYMUkR3t7uXO_DL7ucA-K7R83kGVJtXx9cFY=",
                "https://media.gettyimages.com/id/574878335/pt/foto/mature-female-patient-at-dental-clinic.jpg?s=2048x2048&w=gi&k=20&c=yKLFxDV-YKRlgvbfOUh5GGPsOBYOC2S-EtFuUaBiaOQ="
            ]
    })
})
</script>