class ContaPolpanca(
    titular: String,
    numeroConta: Int
): ContaTransferivel(
    titular,
    numeroConta
) {
    override fun saque(valor: Double) {
        if(this.saldo > valor){
            this.saldo -= valor
        }
    }
}