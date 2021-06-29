package br.com.alura.bytebank.exception

class ErroNaAutenticacaoException(mensagem: String = "Erro ao autenticar conta"): Exception(mensagem) {
}