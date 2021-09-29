package Parque

import Animal.Animal
import Animal.accionAzar
import Parque.*
import generaAleatorio


fun simulacion(parque: Parque) {
    var tiempo = 0


    while (tiempo < 60) {
        try {
            Thread.sleep(1000)
            tiempo++

            //este tiene que ser 10 -> tiene 2 para una probar la simulacion mas rapido
            if (tiempo % 2 == 0) {
                println("TIEMPO: " + tiempo+ " -> ")
                newAnimalEnParque(parque)
            }

            if (tiempo % 2 == 0) {
                println("TIEMPO: " + tiempo+ " -> ")
                simulacionAccion(parque)
            }

            //este tiene que ser 15 -> tiene 10 para una probar la simulacion mas rapido
            if (tiempo % 10 == 0) {
                println("TIEMPO: " + tiempo+ " -> ")
                simulacionCambioPosi(parque)
            }

            if (tiempo % 20 == 0) {
                println("TIEMPO: " + tiempo+ " -> ")
                simulacionAbandonarParque(parque)
            }
            println("CAPACIDAD DEL PARQUE : " + parque.capacidadDelParque() + " ANIMALES")
            println("______________________________________________________________")
        } catch (e: Exception) {
            println(e)
        }
    }

}

fun simulacionAccion(parque: Parque) {
    for (a in parque.sectores) {
        accionAzar(a as Animal)
    }
}

fun simulacionCambioPosi(parque: Parque) {

    //val posi = comprobarSectores(parque)
    val posi = parque.comprobarSectoresVacios()

    do {
        val posiAnimal = generaAleatorio(0, parque.sectores.count())
        if (parque.sectores[posiAnimal] is Animal) {
            if(posi != -1){
                println("El animal " +parque.sectores[posiAnimal] +" SE HA CAMBIADO de posicion")
                parque.addAnimal(parque.sectores[posiAnimal] as Animal, posi)
                parque.deleteAnimal(posiAnimal)
            }else{
                println("El animal " +parque.sectores[posiAnimal] +" NO HA PODIDO CAMBIAR de posicion")
            }

        }
    } while (parque.sectores[posiAnimal] !is Animal)
}

fun simulacionAbandonarParque(parque: Parque) {
    val alea = generaAleatorio(0, 100)

    if (alea <= 50) {
        do {
            val posiAnimal = generaAleatorio(0, parque.sectores.count())

            if (parque.sectores[posiAnimal] is Animal) {
                var a = parque.sectores[posiAnimal] as Animal
                println("El animal " + a + " ha ABANDONADO el parque. CHAO")
                parque.deleteAnimal(posiAnimal)
            }
        } while (parque.sectores[posiAnimal] !is Animal)
    }
}

