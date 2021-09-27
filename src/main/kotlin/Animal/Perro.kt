package Animal

import generaAleatorio

class Perro(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {


    override fun hacerRuido() {
        println(this.nombre + " acaba de ladrad")
    }

    override fun hacerCaso() {
        val randomValue = generaAleatorio(0, 100)
        if (randomValue <= 90) {
            println(this.nombre + "te ha hecho caso")
        } else {
            println(this.nombre + "no te ha hecho nada de caso")
        }

    }

    fun sacaPaseo() {
        println(this.nombre + " lo acaban de sacar a pasear")
    }
}