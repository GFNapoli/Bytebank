package br.com.alura.bytebank.modelos

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
): ContaTransferivel(
    titular,
    numeroConta
) {

    override fun saque(valor: Double) {
        val valorComCusto = valor + 0.10
        if(this.saldo > valorComCusto){
            this.saldo -= valorComCusto
        }
    }
}