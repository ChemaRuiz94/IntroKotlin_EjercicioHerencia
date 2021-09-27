import Animal.Elefante
import Animal.Gato
import Animal.Perro

fun main(){
    var perro1 : Perro = Perro("Tobi","Corgi",13.3,"Marron")
    perro1.sacaPaseo()
    perro1.hacerCaso()
    perro1.hacerRuido()

    var gato1: Gato = Gato("Michi", "Munchkin",5.2,"Pardo")
    gato1.toserBolaPelo()
    gato1.hacerCaso()
    gato1.hacerRuido()

    var elefante1: Elefante = Elefante("Dumbo", "Indio",220.00,"Gris")
   elefante1.hacerCaso()
    elefante1.comer()
    elefante1.dormir()
}