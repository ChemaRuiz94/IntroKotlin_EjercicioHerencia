package Parque

import generaAleatorio
import Animal.*
import java.text.ParseException

fun factoriaParque():Parque{
    var max : Int = 1
    var correcto = false

    do {
        max = pedirCapaciadUsuario()
        if (max < 1){println("Numeros negativos no")}
    }while (max < 1)

    var sectores: ArrayList<Any> = ArrayList(max)
    var parque:Parque = Parque(sectores,max)
    return parque
}

fun pedirCapaciadUsuario():Int{
    var max: Int = 0
    var correcto = false

    while (!correcto) {
        try {
            println("Introduce la capacidad máxima de secotres para el ZOO")
            max = readLine().toString().toInt()
            correcto = true
        } catch (e: Exception) {
            println("ERROR -> Introduce un numero entero para la capcidad del parque")
        }
    }

    return max
}

fun newAnimalEnParque(parque : Parque) {

    val aleatorio = generaAleatorio(1, 3)

    when (aleatorio) {
        1 -> addPerro(parque)
        2 -> addGato(parque)
        3 -> addElefante(parque)
    }

}


fun addPerro(parque : Parque){
    //val posi = comprobarSectores(parque)
    val posi = parque.comprobarSectoresVacios()

    if( posi != -1){
        var perro: Perro = crearPerro()
        parque.addAnimal(perro,posi)
        println("Un nuevo perro acaba de llegar al parque y SI ha encontrado un hueco -> " +perro)
    }else{
        println("Un nuevo perro acaba de llegar al parque y NO tenia hueco para entrar")
    }
}

fun addGato(parque : Parque){
    //val posi = comprobarSectores(parque)
    val posi = parque.comprobarSectoresVacios()

    if(posi != -1){
        var gato : Gato = crearGato()
        parque.addAnimal(gato,posi)
        println("Un nuevo gato acaba de llegar al parque y SI ha encontrado un hueco -> " +gato)
    }else{
        println("Un nuevo gato acaba de llegar al parque y NO tenia hueco para entrar")
    }
}

fun addElefante(parque : Parque){
    //val posi = comprobarSectores(parque)
    val posi = parque.comprobarSectoresVacios()

    if(posi != -1){
        var elefante : Elefante = crearElefante()
        parque.addAnimal(elefante,posi)
        println("Un nuevo elefante acaba de llegar al parque y SI ha encontrado un hueco -> " +elefante)
    }else{
        println("Un nuevo elefante acaba de llegar al parque y NO tenia hueco para entrar")
    }
}



