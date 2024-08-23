package banco

fun main() {

    val banco = Banco()
    val cliente1 = Cliente("Carlos Gonzales", 1000.0)
    val cliente2 = Cliente("Keyla Torres", 500.0)

    banco.agregarCliente(cliente1)
    banco.agregarCliente(cliente2)

    banco.mostrarClientes()

    cliente1.depositar(200.0)
    cliente2.retirar(100.0)

    println("\nDespués de las operaciones:")
    banco.mostrarClientes()
}