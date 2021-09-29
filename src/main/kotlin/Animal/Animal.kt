package Animal

abstract class Animal(var nombre: String, var raza: String, var peso: Double, var color: String) {

    fun vacunar() {
        println(this.nombre + " ha sido vacunado/a")
    }

    abstract fun comer()

    abstract fun dormir()

    abstract fun hacerRuido()

    open fun hacerCaso() {}

    override fun toString(): String {
        return "NOMBRE: " + this.nombre + ", RAZA: " + this.raza + ", PESO: " + this.peso + ", COLOR: " + this.color
    }
}