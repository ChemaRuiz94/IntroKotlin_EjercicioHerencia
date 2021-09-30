import Animal.Elefante
import Animal.Gato
import Animal.Perro
import Parque.FactoriaParque
import Parque.Parque
import Parque.simulacion

fun main(){

    var parque :Parque = FactoriaParque.factoriaParque()

    simulacion(parque)


}