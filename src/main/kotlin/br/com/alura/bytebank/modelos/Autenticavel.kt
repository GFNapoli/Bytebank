package br.com.alura.bytebank.modelos

interface Autenticavel {

    fun autenticacao(senha: String): Boolean
}