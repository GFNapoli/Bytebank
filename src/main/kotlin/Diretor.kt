class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    var plr: Double
): FuncionarioAdmin(nome, cpf, salario, senha) {

    override fun bonificacao(): Double {
        return salario + plr
    }

}