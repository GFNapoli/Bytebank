class ContaSalario(
    titular: String,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {
    override fun saque(valor: Double) {
        this.saldo -= valor
    }
}