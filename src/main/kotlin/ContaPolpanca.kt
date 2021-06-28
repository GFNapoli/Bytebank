class ContaPolpanca(
    titular: String,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {
    override fun saque(valor: Double) {
        if(this.saldo > valor){
            this.saldo -= valor
        }
    }
}