import br.com.alura.bytebank.exception.ErroNaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPolpanca
import java.lang.Exception

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

    try {
        contaFran.transferencia(contaAlex, 100.0, "21")
        println("Transferencia bem sucedida")
    }catch (e: SaldoInsuficienteException){
        println("transferencia não executada")
        println(e.message)
        e.printStackTrace()
    }catch (e: ErroNaAutenticacaoException){
        println("Senha Invalida")
        println(e.message)
        e.printStackTrace()
    }catch (e: Exception){
        println("Erro desconhecido")
        println(e.message)
        e.printStackTrace()
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}