package br.com.alura.bytebank

import br.com.alura.bytebank.modelos.Analista
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Funcionario
import br.com.alura.bytebank.modelos.Gerente

fun main() {

    val luiza = Gerente("Luiza", "123.456.789-99", 10000.00, "123")
    val thay = Diretor("Thay", "987.654.321-15", 20000.00, "654", 500.00)
    val jp = Analista("JP", "963.852.741.22", 7000.00)

    val funcionarios: MutableList<Funcionario> = mutableListOf(luiza, thay, jp)

    funcionarios.add(
        Analista("Cassao", "852.963.963-89", 4000.0)
    )

    println(funcionarios)
    funcionarios.imprimeLista()

    val ordenadoFuncionarios: List<Funcionario> = funcionarios.sorted()
    ordenadoFuncionarios.imprimeLista()

    val ordenadoPorSalario = funcionarios.sortedBy { it.cpf }
    ordenadoPorSalario.imprimeLista()

    val funcionariosComT = funcionarios.filter { it.nome.startsWith("t", ignoreCase = true) }
    funcionariosComT.imprimeLista()
}

fun List<Funcionario?>.imprimeLista(){
    val lista = this.filterNotNull().joinToString(separator = "\n"){
        "- ${it.nome}, salario: ${it.salario}"
    }
    println("Lista de funcionarios\n$lista")
}