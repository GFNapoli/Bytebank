class CalculadoraDeBonificacao {

    var totalBonificacao: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        totalBonificacao += funcionario.bonificacao()
    }
}