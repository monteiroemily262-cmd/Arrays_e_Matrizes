fun main() {
    val tarefas = arrayOf(
        "Configurar tela de login",
        "Integrar API de pagamentos",
        "Corrigir bug no carrinho",
        "Publicar versão beta"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }
}
