package banco

class Cliente(val nombre: String, var saldo: Double) {
    fun depositar(cantidad: Double) {
        saldo += cantidad
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo += cantidad
        } else {
            println("saldo insuficiente")
        }
    }

}
