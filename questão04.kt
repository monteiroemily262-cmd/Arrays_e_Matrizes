fun main() {
    val numeros = IntArray(20) { it + 1 } 
    var somaIndicesPares = 0

    for (i in numeros.indices step 2) {
        println("Índice $i -> valor ${numeros[i]}")
        somaIndicesPares += numeros[i]
    }

    println("Soma dos valores em índices pares: $somaIndicesPares")
}
