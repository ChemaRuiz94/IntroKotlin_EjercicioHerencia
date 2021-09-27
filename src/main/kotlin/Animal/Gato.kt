package Animal

import generaAleatorio

class Gato(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {


    override fun hacerRuido() {
        println(this.nombre + " acaba de mauyar")
    }

    override fun hacerCaso() {
        val randomValue = generaAleatorio(0, 100)
        if(randomValue <= 5){
            println(this.nombre + "te ha hecho caso")
        }else{
            println(this.nombre + "no te ha hecho nada de caso")
        }

    }

    fun toserBolaPelo(){
        println(this.nombre +" acaba de toser una bolita de pelos")
    }

}