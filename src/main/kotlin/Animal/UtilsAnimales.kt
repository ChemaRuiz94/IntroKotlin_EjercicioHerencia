package Animal

import generaAleatorio

fun crearPerro(): Perro {
    var perro: Perro = Perro(genNombre(), genRazaPerro(), generaAleatorio(4,80).toDouble(), genColor())

    return perro
}

fun crearGato(): Gato {
    var gato: Gato = Gato(genNombre(), genRazaGato(), generaAleatorio(4,30).toDouble(), genColor())

    return gato
}

fun crearElefante(): Elefante {
    var elefante: Elefante = Elefante(genNombre(), genRazaElefante(), generaAleatorio(80,300).toDouble(), genColor())

    return elefante
}

fun genNombre(): String {
    val num = generaAleatorio(0, 7)
    var nombre = ""
    when (num) {
        0 -> nombre = "COWI"
        1 -> nombre = "MIKEY"
        2 -> nombre = "EIN"
        3 -> nombre = "ZOE"
        4 -> nombre = "FIDO"
        5 -> nombre = "SPIKE"
        6 -> nombre = "VENUS"
        7 -> nombre = "NANA"
    }
    return nombre
}

fun genRazaPerro(): String {
    val num = generaAleatorio(0, 3)
    var raza = ""
    when (num) {
        0 -> raza = "CORGI"
        1 -> raza = "BULLDOG"
        2 -> raza = "DOBERMAN"
        3 -> raza = "PINCHE"
    }
    return raza
}

fun genRazaGato(): String {
    val num = generaAleatorio(0, 3)
    var raza = ""
    when (num) {
        0 -> raza = "MUNCKING"
        1 -> raza = "PERSA"
        2 -> raza = "BENGALA"
        3 -> raza = "SPHYNX"
    }
    return raza
}

fun genRazaElefante(): String {
    val num = generaAleatorio(0, 2)
    var raza = ""
    when (num) {
        0 -> raza = "AFRICANO"
        1 -> raza = "ASIATICO"
        2 -> raza = "HINDU"
    }
    return raza
}

fun genColor(): String {
    val num = generaAleatorio(0, 7)
    var color = ""
    when (num) {
        0 -> color = "CANELA"
        1 -> color = "BLANCO"
        2 -> color = "GRIS"
        3 -> color = "PARDO"
        4 -> color = "MARRON"
    }
    return color
}

fun accionAzar(a : Animal){
    val num = generaAleatorio(0, 2)
    when (num){
        0-> a.dormir()
        1-> a.comer()
        2-> a.hacerRuido()

    }
}



