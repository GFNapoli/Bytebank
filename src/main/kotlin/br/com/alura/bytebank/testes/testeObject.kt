package br.com.alura.bytebank.testes

fun testeObject() {
    val bruna = object {
        val nome = "Bruna"
        val cpf = "852.963.741-98"
        val senha = "456"

        fun autentica(senha: String): Boolean {
            if (this.senha == senha)
                return true
            return false
        }
    }

    if (bruna.autentica("456")) {
        println("O nome dela é ${bruna.nome}, cpf ${bruna.cpf}")
    } else {
        println("Acesso não permitido")
    }
}