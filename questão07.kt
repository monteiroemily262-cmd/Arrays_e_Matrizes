fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val linhasOrig = original.size       
    val colunasOrig = original[0].size 

    val transposta = Array(colunasOrig) { IntArray(linhasOrig) }

    for (i in 0 until linhasOrig) {
        for (j in 0 until colunasOrig) {
            transposta[j][i] = original[i][j]
        }
    }

    println("=== Matriz Original (2x3) ===")
    for (linha in original) {
        println(linha.joinToString(" "))
    }

    println("\n=== Matriz Transposta (3x2) ===")
    for (linha in transposta) {
        println(linha.joinToString(" "))
    }
}
