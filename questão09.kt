fun main() {
    val matriz3x3 = arrayOf(
        intArrayOf(15, 0, 25),
        intArrayOf(0, 40, 0),
        intArrayOf(10, 5, 0)
    )

    var somaPositivos = 0

    for (linha in matriz3x3) {
        for (valor in linha) {
            if (valor == 0) {
                continue
            }
            if (valor > 0) {
                somaPositivos += valor
            }
        }
    }

    println("Soma dos valores maiores que zero: $somaPositivos")
}
