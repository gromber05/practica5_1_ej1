import kotlin.math.PI

class Circulo(color: String, val radio : Int) : Figura(color) {

    override fun area(): Int {
        return ((radio * radio) * PI).toInt()
    }

    override fun perimetro(): Int {
        return (2 * PI * radio).toInt()
    }

}