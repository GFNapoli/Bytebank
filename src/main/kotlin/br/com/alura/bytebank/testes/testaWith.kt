package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Tapuios"
        numero = 1022
        bairro = "Saraiva"
        cep = "38408270"
        cidade = "Uberlandia"
        complemento = "Apartamento 2"
        estado = "Minas Gerais"

        completo()
    }.let(::println)
}