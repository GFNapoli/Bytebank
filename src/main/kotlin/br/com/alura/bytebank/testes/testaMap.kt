package br.com.alura.bytebank.testes

fun testaMap() {
    val pedidos = mutableMapOf<Int, Double>(Pair(5, 10.0), Pair(9, 35.0), 4 to 55.0, 6 to 60.0, 8 to 20.0, 2 to 40.0)
    println(pedidos)
    println(pedidos?.get(2))
    println(pedidos.getValue(6))
    println(pedidos.getOrElse(1){
        null
    })
    println(pedidos.getOrDefault(10, 0.0))

    for(numeroPedidos in pedidos.keys){
        println("pedido numero $numeroPedidos")
    }

    for (valorPedidos in pedidos.values){
        println("valor do pedido ${valorPedidos}")
    }

    println(pedidos.filter { (key, value) ->
        key % 2 == 0 && value > 50.0
    })
    println(pedidos.filterKeys { key ->
        key % 2 == 0
    })
    println(pedidos.filterValues { values ->
        values > 50.0
    })
    println(pedidos + mapOf<Int, Double>(1 to 10.0, 12 to 11.0))
    println(pedidos)
    println(pedidos + Pair(22, 10.0))
    println(pedidos.putAll(setOf(1 to 10.0, 13 to 5.21)))
    pedidos += mapOf<Int, Double>(1 to 22.0)
    pedidos -= 2
    println(pedidos)
    pedidos.keys.remove(6)
    pedidos.values.remove(55.0)
    println(pedidos)

}

fun TesteMap1(pedidos: Map<Int, Double>) {
    val pedido = pedidos[9]
    pedido?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    val pedidos2 = mutableMapOf<Int, Double>(Pair(1, 30.0), Pair(5, 55.0), Pair(2, 22.0))
    pedidos2[7] = 65.0
    pedidos2.put(3, 95.0)
    pedidos2.putIfAbsent(6, 66.6)
    println(pedidos2)
    pedidos2.putIfAbsent(6, 70.6)
    println(pedidos2)

    pedidos2.remove(3)
    println(pedidos2)

    pedidos2.remove(6, 70.6)
    println(pedidos2)
    pedidos2.remove(6, 66.6)
    println(pedidos2)
}