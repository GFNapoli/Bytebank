package br.com.alura.bytebank.testes

fun testaPilha() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
//        throw Exception(ClassCastException())
//        throw Exception(NumberFormatException())
//        throw Exception(ArithmeticException())
    }
    println("fim funcao2")
}