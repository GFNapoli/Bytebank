package br.com.alura.bytebank.modelos

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: String){
        if(admin.autenticacao(senha)){
            println("Bem vindo ao Bytebank")
        }else println("Acesso não autorizado!")
    }
}