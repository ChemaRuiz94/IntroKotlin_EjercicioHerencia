package Parque

import generaAleatorio
import Animal.*
import java.text.ParseException



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
        var perro: Perro = FactoriaAnimales.factoriaPerro()
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
        var gato : Gato = FactoriaAnimales.factoriaGato()
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
        var elefante : Elefante = FactoriaAnimales.factoriaElefante()
        parque.addAnimal(elefante,posi)
        println("Un nuevo elefante acaba de llegar al parque y SI ha encontrado un hueco -> " +elefante)
    }else{
        println("Un nuevo elefante acaba de llegar al parque y NO tenia hueco para entrar")
    }
}



