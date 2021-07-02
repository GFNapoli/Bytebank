package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Autenticavel
import br.com.alura.bytebank.modelos.SistemaInterno

fun testaHOF() {
    soma(3, 3) {
        println(it)
    }

    soma(3, 3){
        println(it)
    }

    val user = object : Autenticavel {
        val senha = "1234"
        override fun autenticacao(senha: String): Boolean {
            return this.senha == senha
        }
    }

    SistemaInterno().entrar(user, "1234") {
        println("Agora pague o aluguel ")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("Preparando conta")
    resultado(a + b)
    println("Conta concluida")
}

fun somaReciver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("Preparando conta")
    resultado(a + b)
    println("Conta concluida")
}