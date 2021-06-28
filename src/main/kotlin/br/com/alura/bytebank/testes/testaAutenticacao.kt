import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Gerente
import br.com.alura.bytebank.modelos.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente("Luiza", "111.111.111-11", 2000.0, "1234")
    val diretor = Diretor("Thay", "222.222.222-22", 3000.0, "4567", 200.0)
    val cliente = Cliente("Bim", "333.333.333-33", "9876")

    val sistema = SistemaInterno()

    sistema.entrar(gerente, "1234")
    sistema.entrar(diretor, "4567")
    sistema.entrar(cliente, "9876")
}