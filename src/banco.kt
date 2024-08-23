package banco

class Banco {
    private val clientes = mutableListOf<Cliente>()

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }
    fun mostrarClientes() {
        for (cliente in clientes) {
            println("Cliente: ${cliente.nombre}, Saldo: ${cliente.saldo}")
        }
    }
}