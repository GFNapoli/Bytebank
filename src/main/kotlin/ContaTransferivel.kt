abstract class ContaTransferivel(
    titular: String,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {
    fun transferencia(conta: ContaTransferivel, valor: Double): Boolean {
        return if(this.saldo > valor) {
            this.saldo -= valor
            conta.deposita(valor)
            true
        }else{
            false
        }
    }
}