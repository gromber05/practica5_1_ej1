

class Rectangulo(color: String, val ladoMayor: Int, val ladoMenor: Int) : Figura(color) {

    override fun area(): Int {
        return ladoMayor * ladoMenor
    }

    override fun perimetro(): Int {
        return 2 * ladoMayor * ladoMenor
    }

}