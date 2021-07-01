package br.com.alura.bytebank.modelos

class BancoDeNomes {
    val nome: Collection<String> = dados.toList()

    companion object{
        val dados: MutableCollection<String> = mutableListOf()
    }
    fun salva(nome: String){
        dados.add(nome)
    }
}