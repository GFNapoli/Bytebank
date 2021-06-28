class SistemaInterno {

    fun entrar(admin: FuncionarioAdmin, senha: String){
        if(admin.atenticacao(senha)){
            println("Bem vindo ao Bytebank")
        }else println("Acesso não autorizado!")
    }
}