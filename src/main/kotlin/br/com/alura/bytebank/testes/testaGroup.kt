package br.com.alura.bytebank.testes

fun testaGroup() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 29.0),
        Pedido(5, 25.0),
        Pedido(6, 21.0)
    )

    println(pedidos)

    val mapPedido = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numeroPèdido, pedido)
    }
    println(mapPedido)

    val mapPedido2 = pedidos.associateBy { pedido -> pedido.numeroPèdido }
    println(mapPedido2)

    val mapPedido3 = pedidos.associateWith { pedido ->
        pedido.valorPedido > 25.0
    }
    println(mapPedido3)

    val agrupar = pedidos.groupBy {
        it.valorPedido < 30
    }
    println(agrupar)

    val contatos = listOf<String>(
        "Thay",
        "Maria",
        "Luiza",
        "Julia",
        "Renata",
        "Roberta",
        "Regina",
        "Thais",
        "Tiffa",
        "Laura",
        "Luana"
    )
    val agenda: Map<Char, List<String>> = contatos.groupBy {
        it.first()
    }
    println(agenda)
}

data class Pedido(val numeroPèdido: Int, val valorPedido: Double)