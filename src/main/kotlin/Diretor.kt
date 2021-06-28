class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    var plr: Double
): Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario + plr
    }

    fun atenticacao(senha: String): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}