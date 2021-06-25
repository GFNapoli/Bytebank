fun testaComportamentoConta() {
    var contaAlex = Conta(numeroConta = 10, titular = "Alex")
    contaAlex.deposita(200.0)
    var contaFran = Conta("Fran", 11)
    contaFran.deposita(800.0)
    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex)
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)
    println()
    contaFran.deposita(50.0)
    contaAlex.saque(20.0)
    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)
    println()

    if (contaFran.transferencia(contaAlex, 100.0)) {
        println("Transferencia bem sucedida")
    } else {
        println("transferencia não executada")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}