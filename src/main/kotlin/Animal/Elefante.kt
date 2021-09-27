package Animal
import generaAleatorio

class Elefante (nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {

    override fun hacerRuido() {
        println(this.nombre + " acaba de barritar")
    }


}