package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco

fun testaFuncaoEscopo() {
    run {
        println("INICIANDO PROGRAMA")
    }
    Endereco(logradouro = "Rua Ipiranga", numero = 80).also { println("Preparando Classe") }
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)
    Endereco(logradouro = "Rua Ipiranga", numero = 80).run {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)

    val endereco = Endereco().apply {
        this.bairro = "Laranjeiras"
        this.cep = "38408520"
    }.let(::println)

    with(endereco) {
        println(this.toString())
    }

    listOf(
        Endereco(logradouro = "rua tapuios", numero = 25),
        Endereco(logradouro = "Caronel antonio alves", 2290),
        Endereco(),
        Endereco(numero = 25)
    ).filter { endereco ->
        endereco.logradouro.isNotEmpty()
    }.let(::println)
}


fun testaChamada(valor: String){
    println("teste de chamada $valor")
}

fun chanandoOutra(bloco: () -> Unit){

}

fun teste(valor: String, bloco: () -> Unit){

}