class Conta(val titular: String, val numeroConta: Int){
    var saldo = 0.0
    private set

    fun deposita(valor:Double){
        this.saldo += valor
    }

    fun saque(valor:Double){
        if(this.saldo > valor){
            this.saldo -= valor
        }
    }

    fun transferencia(conta: Conta, valor:Double): Boolean{
        return if(this.saldo > valor) {
            this.saldo -= valor
            conta.deposita(valor)
            true
        }else{
            false
        }
    }
}