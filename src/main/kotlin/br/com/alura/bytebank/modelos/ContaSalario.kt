package br.com.alura.bytebank.modelos

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {
    override fun saque(valor: Double) {
        this.saldo -= valor
    }
}