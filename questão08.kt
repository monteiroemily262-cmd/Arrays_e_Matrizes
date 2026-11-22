fun main() {
    val matriz4x4 = arrayOf(
        intArrayOf(5, 2, 1, 8),
        intArrayOf(3, 9, 4, 7),
        intArrayOf(6, 1, 12, 2),
        intArrayOf(4, 8, 3, 15)
    )

    var somaDiagonalPrincipal = 0

    println("=== Matriz 4x4 ===")
    for (i in matriz4x4.indices) {
        for (j in matriz4x4[i].indices) {
            print("${matriz4x4[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz4x4[i][j]
            }
        }
        println()
    }

    println("\nSoma da Diagonal Principal: $somaDiagonalPrincipal")
}
