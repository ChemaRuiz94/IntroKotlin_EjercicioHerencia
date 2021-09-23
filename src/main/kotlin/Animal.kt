abstract class Animal (var nombre:String, var raza: String, var peso: Double, var color: String) {

    abstract fun hacerRuido():String
    abstract fun hacerCaso():String

    override fun toString(): String {
        return "NOMBRE: " +this.nombre+ ", RAZA: " +this.raza+ ", PESO: " + this.peso + ", COLOR: " + this.color
    }
}