abstract class Conta(val titular: String, val numeroConta: Int){
    var saldo = 0.0
    protected set

    fun deposita(valor:Double){
        this.saldo += valor
    }

    abstract fun saque(valor:Double)

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