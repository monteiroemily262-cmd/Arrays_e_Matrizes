fun main() {
    val matriz = arrayOf(
        intArrayOf(2, 4, 6, 8),
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 20, 30, 40)
    )

    for (linha in matriz.indices) {
        var somaLinha = 0
        for (coluna in matriz[linha].indices) {
            somaLinha += matriz[linha][coluna]
        }
        println("Soma da linha $linha: $somaLinha")
    }
}
