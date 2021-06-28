package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Endereco

fun testaEndereco() {
    val endereco = Endereco(
        "Rua Ipiranga",
        80,
        "Carmo",
        "Monte Carmelo",
        "Minas Gerais",
        "38500-000",
        "ao lado do ferro velho"
    )
    val luiza = Cliente("Luiza", "111.111.111-11", endereco, "123")
    val thay = Cliente("Thay", "852.963.741-12", senha = "1212")

    println("o endereço é: ${luiza.endereco.logradouro}, numero: ${luiza.endereco.numero}")
}