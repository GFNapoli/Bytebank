package br.com.alura.bytebank.modelos

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: String, entrada:() -> Unit){
        if(admin.autenticacao(senha)){
            println("Bem vindo ao Bytebank")
            entrada()
        }else println("Acesso não autorizado!")
    }

    fun entraReciver(admin: Autenticavel, senha: String, entrada: SistemaInterno.() -> Unit){
        if(admin.autenticacao(senha)){
            println("Bem vindo ao Bytebank")
            entrada(this)
        }else println("Acesso não autorizado!")
    }
}