fun testaRepeticao(){
    for (i in 1..5){
        val titular = "Alberto $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        saldo += 100

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        testaNumero(saldo)
    }
    for (i in 5 downTo 1){
        val titular = "Alberto $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        saldo += 100

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        testaNumero(saldo)
    }
    for (i in 5 downTo 1 step 2){
        val titular = "Alberto $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        saldo += 100

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        testaNumero(saldo)
    }
    var i = 0
    while (i < 5){
        val titular = "Alberto $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        saldo += 100

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        testaNumero(saldo)
        i++
    }
}