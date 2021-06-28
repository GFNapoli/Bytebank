package br.com.alura.bytebank.modelos

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario * 1.5
    }
}