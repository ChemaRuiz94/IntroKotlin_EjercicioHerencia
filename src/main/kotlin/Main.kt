import Animal.Elefante
import Animal.Gato
import Animal.Perro
import Parque.Parque
import Parque.factoriaParque
import Parque.simulacion

fun main(){
    var sectores: ArrayList<Any> = ArrayList(10)
    var parque :Parque = factoriaParque()

    simulacion(parque)


}