

fun main() {
    val circulo = Circulo("Rojo", 5)
    println("Círculo - Color: ${circulo.color}, Área: ${circulo.area()}, Perímetro: ${circulo.perimetro()}")

    val rectangulo = Rectangulo("Azul", 4, 6)
    println("Rectángulo - Color: ${rectangulo.color}, Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")

    val triangulo = Triangulo("Verde", 4, 3, arrayOf(3, 4, 5), false)
    println("Triángulo - Color: ${triangulo.color}, Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}")
}