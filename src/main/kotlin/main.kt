fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente("Luiza", 123)
    val contaPolpanca = ContaPolpanca("Maria", 456)
    contaCorrente.deposita(10000.0)
    contaPolpanca.deposita(1000.0)
    println("Saldo ${contaCorrente.titular} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular} é $${contaPolpanca.saldo}")
    println()

    contaCorrente.saque(100.0)
    contaPolpanca.saque(15.0)
    println("Saldo depois dos saques")
    println("Saldo ${contaCorrente.titular} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular} é $${contaPolpanca.saldo}")
    println()

    contaCorrente.transferencia(contaPolpanca, 1500.0)
    println("Saldo depois da transferencia")
    println("Saldo ${contaCorrente.titular} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular} é $${contaPolpanca.saldo}")
    println()

}

