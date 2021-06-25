class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario * 1.5
    }
}