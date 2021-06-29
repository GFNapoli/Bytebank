package br.com.alura.bytebank.testes

import java.lang.NumberFormatException

fun testeException() {
    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println("A divisao não existe tente o limite tendendo a zero de 10/x")
    }

    val externo: String = "1,9"
    val valorSemTaxa: Double? = try {
        externo.toDouble()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        println("erro na conversao")
        null
    }

    val valorComTaxa: Double? = if (valorSemTaxa != null) {
        valorSemTaxa * 0.1
    } else {
        null
    }
    println(valorComTaxa)
}