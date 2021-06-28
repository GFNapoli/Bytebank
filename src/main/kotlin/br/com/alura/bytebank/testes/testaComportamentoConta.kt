import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPolpanca

fun testaComportamentoConta() {
    val alex = Cliente("Alex", "666.666.666-66", senha = "12")
    var contaAlex = ContaCorrente(numeroConta = 10, titular = alex)
    contaAlex.deposita(200.0)
    val fran = Cliente("Fran", "777.777.777-77",senha ="21")
    var contaFran = ContaPolpanca(fran, 11)
    contaFran.deposita(800.0)
    println(contaAlex.titular.nome)
    println(contaAlex.numeroConta)
    println(contaAlex)
    println()
    println(contaFran.titular.nome)
    println(contaFran.numeroConta)
    println(contaFran.saldo)
    println()
    contaFran.deposita(50.0)
    contaAlex.saque(20.0)
    println(contaAlex.titular.nome)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular.nome)
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