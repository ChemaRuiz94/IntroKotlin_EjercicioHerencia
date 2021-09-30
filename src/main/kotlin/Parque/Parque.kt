package Parque

import Animal.Animal

class Parque (sect: ArrayList<Any>, maxSectores:Int){
    var sectores: ArrayList<Any> = sect
    var maxSectores: Int = maxSectores

    fun addAnimal(animal: Animal, posi: Int){
        this.sectores.add(posi,animal)
    }

    fun deleteAnimal(posi:Int){
        this.sectores.removeAt(posi)
    }

    fun comprobarSectoresVacios(): Int{

        var posi = 0

        if(capacidadDelParque() < this.maxSectores){
            for (a in sectores){
                if (a == null){
                    posi = sectores.indexOf(a) //devuelve la posi si esta vacio
                }
            }

        }else{
            posi =  -1 // devuelve -1 si no esta vacio
        }
        return posi
    }

    fun capacidadDelParque():Int{return this.sectores.size}
}