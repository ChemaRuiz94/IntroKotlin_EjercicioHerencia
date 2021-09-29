package Animal

import generaAleatorio

class Elefante(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {

    override fun comer() {
        println("El elefante " + this.nombre + " acaba de comer. ÑAM ÑAM")
    }

    override fun dormir() {
        println("El elefante " + this.nombre + " se ha echado la siesta")
    }

    override fun hacerRuido() {
        println("El elefante " + this.nombre + " acaba de barritar")
    }


}