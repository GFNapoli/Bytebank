package br.com.alura.bytebank.modelos

import br.com.alura.bytebank.exception.ErroNaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {
    fun transferencia(conta: ContaTransferivel, valor: Double, senha: String){
        if(!this.titular.autenticacao(senha)){
            throw ErroNaAutenticacaoException()
        }
        if(this.saldo < valor) {
            throw SaldoInsuficienteException()
        }
        this.saldo -= valor
        conta.deposita(valor)
    }
}
