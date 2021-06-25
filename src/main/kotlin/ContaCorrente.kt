class ContaCorrente(
    titular: String,
    numeroConta: Int
): Conta(
    titular,
    numeroConta
) {

    override fun saque(valor: Double) {
        super.saque(valor + 0.10)
    }
}