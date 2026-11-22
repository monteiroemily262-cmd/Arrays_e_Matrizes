fun main() {
    val temperaturas = doubleArrayOf(28.5, 31.0, 29.8, 32.4, 27.9, 30.2, 31.5)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size
    println("Média da semana: ${"%.2f".format(media)}°C")
    println("Dias (índices) acima da média:")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("- Índice $i: ${temperaturas[i]}°C")
        }
    }
}
