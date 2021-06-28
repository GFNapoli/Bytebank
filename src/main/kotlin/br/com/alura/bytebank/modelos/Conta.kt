package br.com.alura.bytebank.modelos

abstract class Conta(val titular: Cliente, val numeroConta: Int){
    var saldo = 0.0
    protected set

    fun deposita(valor:Double){
        this.saldo += valor
    }

    abstract fun saque(valor:Double)
}