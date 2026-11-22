fun main() {
    val notasAlunos = Array(3) { DoubleArray(2) }

    // Preenchendo as 2 notas de cada um dos 3 alunos
    notasAlunos[0] = doubleArrayOf(8.0, 7.5) // Aluno 1 -> média 7.75
    notasAlunos[1] = doubleArrayOf(5.5, 6.0) // Aluno 2 -> média 5.75
    notasAlunos[2] = doubleArrayOf(7.0, 7.0) // Aluno 3 -> média 7.00

    var somaMedias = 0.0

    for (i in notasAlunos.indices) {
        val n1 = notasAlunos[i][0]
        val n2 = notasAlunos[i][1]
        val mediaAluno = (n1 + n2) / notasAlunos[i].size
        somaMedias += mediaAluno

        val status = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"
        println("Aluno ${i + 1} | Notas: $n1, $n2 | Média: ${"%.2f".format(mediaAluno)} | $status")
    }

    val mediaGeralTurma = somaMedias / notasAlunos.size
    println("\nMédia geral da turma: ${"%.2f".format(mediaGeralTurma)}")
}
