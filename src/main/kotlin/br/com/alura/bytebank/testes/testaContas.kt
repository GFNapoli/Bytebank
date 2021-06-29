import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Conta
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPolpanca

fun testaContas() {

    val luiza = Cliente("Luiza", "888.888.888-88", senha = "56")
    val maria = Cliente("Maria", "999.999.999-99", senha = "65")

    val contaCorrente = ContaCorrente(luiza, 123)
    val contaPolpanca = ContaPolpanca(maria, 456)
    contaCorrente.deposita(10000.0)
    contaPolpanca.deposita(1000.0)
    println("Saldo ${contaCorrente.titular.nome} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular.nome} é $${contaPolpanca.saldo}")
    println()

    contaCorrente.saque(100.0)
    contaPolpanca.saque(15.0)
    println("Saldo depois dos saques")
    println("Saldo ${contaCorrente.titular.nome} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular.nome} é $${contaPolpanca.saldo}")
    println()

    contaCorrente.transferencia(contaPolpanca, 1500.0, "56")
    println("Saldo depois da transferencia")
    println("Saldo ${contaCorrente.titular.nome} é $${contaCorrente.saldo}")
    println("Saldo ${contaPolpanca.titular.nome} é $${contaPolpanca.saldo}")
    println()

    println("Numero de contas criadas ${Conta.total}")
}