package br.com.alura.bytebank.modelos

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
): Comparable<Funcionario> {
    abstract fun bonificacao(): Double

    override fun compareTo(other: Funcionario): Int {
        return this.nome.compareTo(other.nome)
    }
}