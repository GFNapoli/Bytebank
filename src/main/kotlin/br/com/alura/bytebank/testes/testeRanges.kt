package br.com.alura.bytebank.testes

fun testeRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    val numeroPares = 2..100 step 2
    numeroPares.forEach {
        print("$it ")
    }
    println()

    val numeroPares2 = 2.until(100) step 2
    numeroPares2.forEach {
        print("$it ")
    }
    println()

    val numeroImpares = 99.downTo(0) step 2
    numeroImpares.forEach {
        print("$it ")
    }
    println()

    val alfabeto = "a".."z"
    val letra = "k"
    if (letra in alfabeto) {
        println("Letra pertence ao alfabeto")
    } else {
        println("letra não pertecene ao Alfabeto")
    }
}