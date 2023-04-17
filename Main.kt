fun main(args: Array<String>) {
    println("Hola soy Lacalcu la calculadora en que te puedo ayudar?")
    println("1. Necesito hacer una suma")
    println("2. Necesito hacer una resta")
    println("3. Necesito hacer una multiplicacion")
    println("4. Necesito hacer una division")

    val opcionIngresado = readLine()

    when (opcionIngresado){
        "1" -> RealizarUnaSuma()
        "2" -> realizarUnaResta()
        "3" -> realizarUnaMultiplicacion()
        "4" -> realizarUnaDivision()
        else -> MostrarError()

    }
}

fun RealizarUnaSuma() {
    println("dame el primer numero")
    var numero1 = readLine()!!.toInt()
    println("dame el segundo numero")
    var numero2 = readLine()!!.toInt()

    var resultado = numero1 + numero2

    println("El resultado de la suma de ambos numeros es $resultado")

}
fun realizarUnaResta() {
    println("dame el primer numero")
    var numero1 = readLine()!!.toInt()
    println("dame el segundo numero")
    var numero2 = readLine()!!.toInt()

    var resultado = numero1 - numero2

    println("El resultado de la resta de ambos numeros es $resultado")
}

fun realizarUnaMultiplicacion() {
    println("dame el primer numero")
    var numero1 = readLine()!!.toInt()
    println("dame el segundo numero")
    var numero2 = readLine()!!.toInt()

    var resultado = numero1 * numero2

    println("El resultado de la multiplicacion de ambos numeros es $resultado")
}

fun realizarUnaDivision() {
    println("dame el primer numero")
    var numero1 = readLine()!!.toInt()
    println("dame el segundo numero")
    var numero2 = readLine()!!.toInt()

    var resultado = numero1 / numero2

    println("El resultado de la division de ambos numeros es $resultado")
}
fun MostrarError() {
    println("Vaya parece que has elegido una opcion no valida, intenta de nuevo")
}
