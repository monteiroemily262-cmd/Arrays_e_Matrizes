fun main() {
    val transacoes = arrayOf("TXN-101", "TXN-204", "TXN-309", "TXN-412", "TXN-550")
    val codigoAlvo = "TXN-309"
    var encontrado = false

    for (i in transacoes.indices) {
        if (transacoes[i] == codigoAlvo) {
            println("Código '$codigoAlvo' encontrado na posição (índice) $i.")
            encontrado = true
            break
        }
    }

    if (!encontrado) {
        println("Código '$codigoAlvo' não encontrado.")
    }
}
