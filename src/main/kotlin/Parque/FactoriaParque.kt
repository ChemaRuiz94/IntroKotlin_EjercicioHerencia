package Parque

object FactoriaParque {

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
}