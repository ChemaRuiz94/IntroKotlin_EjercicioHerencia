abstract class Animal(var nombre: String, var raza: String, var peso: Double, var color: String) {

    open fun vacunar() {
        println(this.nombre + " ha sido vacunado/a")
    }

    open fun comer() {
        println(this.nombre + " acaba de comer. ÑAM ÑAM")
    }

    open fun dormir() {
        println(this.nombre + " se ha echado la siestaZZZZZ")
    }

    abstract fun hacerRuido()
    abstract fun hacerCaso()

    override fun toString(): String {
        return "NOMBRE: " + this.nombre + ", RAZA: " + this.raza + ", PESO: " + this.peso + ", COLOR: " + this.color
    }
}