package br.com.alura.bytebank.modelos

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(
    nome,
    cpf,
    salario,
) {
    override fun bonificacao(): Double {
        return salario * 0.05
    }
}