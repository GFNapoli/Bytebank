package br.com.alura.bytebank.modelos

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: String
): Autenticavel {
    override fun autenticacao(senha: String): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}