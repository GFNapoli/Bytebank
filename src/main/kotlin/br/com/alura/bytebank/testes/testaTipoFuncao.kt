package br.com.alura.bytebank.testes

fun testaFuncaoAnonima() {
    val minhaAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario < 5000.0) {
            return salario + 500.0
        }
        return salario * 1.1
    }
    println(minhaAnonima(5000.0))
}

fun testaFuncaoLambda() {
    val calculabonificacaoLambda: (salario: Double) -> Double = labada@{ salario ->
        if (salario < 5000.0) {
            return@labada salario + 500.0
        }
        salario * 1.1
    }
    println(calculabonificacaoLambda(6000.0))
}

fun testaTipoFuncao() {
    val tipoFun: (Int, Int) -> Int = ::soma
    println(tipoFun(5, 4))
}

fun testaTipoClasse() {
    val classeFun = Soma()
    println(classeFun(5, 10))
}

fun soma(a: Int, b: Int): Int{
    return a+b
}

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }

}