package Animal

abstract class Animal(var nombre: String, var raza: String, var peso: Double, var color: String) {

    fun vacunar() {
        println(this.nombre + " ha sido vacunado/a")
    }

     fun comer() {
        println(this.nombre + " acaba de comer. ÑAM ÑAM")
    }

     fun dormir() {
        println(this.nombre + " se ha echado la siestaZZZZZ")
    }

    abstract fun hacerRuido()

    open fun hacerCaso(){}

    override fun toString(): String {
        return "NOMBRE: " + this.nombre + ", RAZA: " + this.raza + ", PESO: " + this.peso + ", COLOR: " + this.color
    }
}