package Animal

import generaAleatorio



fun accionAzar(a : Animal){
    val num = generaAleatorio(0, 2)
    when (num){
        0-> a.dormir()
        1-> a.comer()
        2-> a.hacerRuido()

    }
}



