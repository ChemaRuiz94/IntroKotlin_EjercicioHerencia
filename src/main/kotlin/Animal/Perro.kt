package Animal

import generaAleatorio

class Perro(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {


    override fun comer() {
        println("El perro " + this.nombre + " acaba de comer. ÑAM ÑAM")
    }

    override fun dormir() {
        println("El perro " + this.nombre + " se ha echado la siesta")
    }

    override fun hacerRuido() {
        println("El perro " + this.nombre + " acaba de ladrar")
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
        println("El perro " + this.nombre + " lo acaban de sacar a pasear")
    }
}