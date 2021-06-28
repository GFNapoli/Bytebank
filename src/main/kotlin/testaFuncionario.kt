fun testaFuncionario() {
    val cassao = Analista("Cassao", "111.111.111-11", 1000.0)

    println("Nome: ${cassao.nome}")
    println("Cpf: ${cassao.cpf}")
    println("Salario: $${cassao.salario}")
    println("Bonificação: $${cassao.bonificacao()}")
    println()

    val lucas = Gerente(nome = "Lucas", cpf = "222.222.222-22", salario = 2000.0, senha = "1234")

    println("Nome: ${lucas.nome}")
    println("Cpf: ${lucas.cpf}")
    println("Salario: $${lucas.salario}")
    println("Bonificação: $${lucas.bonificacao()}")
    if (lucas.autenticacao("1234")) {
        println("Acesso consedido")
    } else {
        println("Acesso negado")
    }
    println()

    val jp = Diretor("Joap Paulo", "333.333.333-33", 5000.0, "4321", 2.5)

    println("Nome: ${jp.nome}")
    println("Cpf: ${jp.cpf}")
    println("Salario: $${jp.salario}")
    println("Bonificação: $${jp.bonificacao()}")
    println("Plr: ${jp.plr}")
    if (jp.autenticacao("4321")) {
        println("Acesso consedido")
    } else {
        println("Acesso negado")
    }
    println()

    val thay = Analista("Thay", "444.444.444-44", 6000.0)

    println("Nome: ${thay.nome}")
    println("Cpf: ${thay.cpf}")
    println("Salario: $${thay.salario}")
    println("Bonificação: $${thay.bonificacao()}")
    println()

    val calculadoraDeBonificacao = CalculadoraDeBonificacao()
    calculadoraDeBonificacao.registra(cassao)
    calculadoraDeBonificacao.registra(lucas)
    calculadoraDeBonificacao.registra(jp)
    calculadoraDeBonificacao.registra(thay)
    println("Total bonificação: $${calculadoraDeBonificacao.totalBonificacao}")
}