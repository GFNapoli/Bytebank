package br.com.alura.bytebank.modelos

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
): Funcionario(nome, cpf, salario),
    Autenticavel {

    override fun autenticacao(senha: String): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}