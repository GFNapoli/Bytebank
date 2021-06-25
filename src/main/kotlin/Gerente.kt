class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }

    fun atenticacao(senha: String): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}