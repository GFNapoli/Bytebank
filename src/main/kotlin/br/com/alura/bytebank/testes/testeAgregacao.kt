package br.com.alura.bytebank.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testeAgregacao() {
    val idade: IntArray = intArrayOf(10, 11, 12, 13, 14, 14, 15, 16, 17, 18, 22)

    val maiorIdade = idade.maxOrNull()
    val menorIdade = idade.minOrNull()
    println("maior idade: $maiorIdade, menor idade $menorIdade")

    val media = idade.average()
    println("media das idades é $media")

    val menorDeIdade = idade.all {
        it < 18
    }
    println("todos sao menores de idade? $menorDeIdade")

    val maiorDeIdade = idade.any {
        it < 18
    }
    println("tem alguem maior de idade $maiorDeIdade")

    val maiores = idade.filter {
        it >= 18
    }
    println("os maiores de idade sao : $maiores")

    val busca = idade.find {
        it == 18
    }
    println("resultado busca: $busca")

    val salarios: Array<BigDecimal> = bigDecimalArraysOf("1000.00", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val salariosComAumento: Array<BigDecimal> = salarios.map { salario ->
        if (salario < "5000.00".toBigDecimal()) {
            salario + "500.00".toBigDecimal()
        } else {
            (salario * "1.1".toBigDecimal()).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatorio()

    val gastoTotal = salariosComAumento.fold(gastoInicial){ acc, salario ->
        acc + (salario * 6.toBigDecimal()).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val resultado: BigDecimal = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println(resultado)
}

fun bigDecimalArraysOf(vararg elementos: String): Array<BigDecimal>{
    return Array<BigDecimal>(elementos.size){ i ->
        elementos[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatorio(): BigDecimal{
    return this.reduce { acc, bigDecimal ->
        acc + bigDecimal
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if (this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatorio() / this.size.toBigDecimal()
    }
}