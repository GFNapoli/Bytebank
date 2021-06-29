package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco
import java.lang.IllegalArgumentException

fun testeNulos() {
    var enderecoNulo: Endereco? = null
    enderecoNulo = Endereco(logradouro = "rua ipiranga")
    println(enderecoNulo?.logradouro?.length)
    println(enderecoNulo.logradouro)
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        println(endereco.logradouro)
        println(endereco.complemento?.length ?: throw IllegalArgumentException())
    }
    valor("1")
    valor(1)
}

fun valor(any: Any){
    val numero: Int? = any as? Int
    println(numero)
}