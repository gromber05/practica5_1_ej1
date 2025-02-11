

class Triangulo(color: String, val base: Int, val altura: Int, val lados: Array<Int>, val equilatero : Boolean): Figura(color) {

    override fun area(): Int {
        return ((base * altura) / 2)
    }

    override fun perimetro(): Int {
        if (equilatero) {
            return 3 * base
        } else {
            var perimetroTotal = 0
            for (i in lados) {
                perimetroTotal += i
            }
        }
        return 0
    }

}