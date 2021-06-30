package br.com.alura.bytebank.testes

fun testeArrays() {
    val idades: IntArray = IntArray(4)
    idades[0] = 33
    idades[1] = 44
    idades[2] = 55
    idades[3] = 22

    var maiorIdade: Int = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade)
            maiorIdade = idade
    }
    println("Maior idade: $maiorIdade")

    val idades2: IntArray = intArrayOf(60, 70, 20, 40, 10)

    var menorIdade: Int = Int.MAX_VALUE
    idades2.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade $menorIdade")

    val salarios: DoubleArray = doubleArrayOf(1500.0, 2500.0, 3500.0, 1900.0)

    val aumento = 1.1
    for (index in salarios.indices) {
        salarios[index] = salarios[index] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    val lista: Array<String> = arrayOf("Maria", "Luiza", "Thaynara")
}