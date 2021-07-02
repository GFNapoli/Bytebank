package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaPolpanca

fun testaRun() {
    val taxaAnual = 5.0
    val taxaMensal = taxaAnual / 12

    val contaPolpanca = Cliente("Thay", "111.111.111-11", senha = "1234").let { cliente: Cliente ->
        ContaPolpanca(cliente, 1234)
    }
    contaPolpanca.run {
        deposita(12000.00)
        saldo * taxaMensal
    }.let(::println)

    run {
        var saldo = contaPolpanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }.let(::println)
}