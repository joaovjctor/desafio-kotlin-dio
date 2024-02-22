package com.joaovictor.ktb

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
    private val usuariosInscritos = mutableListOf<Usuario>()

    private val lerInscritos: List<Usuario> = usuariosInscritos

    fun matricularUsuario(usuario: Usuario) {
        usuariosInscritos.add(usuario)
    }

    fun listarMatriculados() {
        println(lerInscritos.joinToString(prefix = "Usuários matriculados na formação $nome:\n", separator = "\n") {
            "${it.nome}"
        })
    }

    fun listarConteudo() {
        println(conteudos.joinToString(prefix = "Os seguintes conteúdos fazem parte da formação $nome:\n", separator = "\n") {
            "Nome: ${it.nome} | Duração: ${it.duracao}h | Nível: ${it.nivel.proficiencia}"
        })
    }

    fun formacaoInfo() {
        println("Formação: $nome\nNível da formação: ${nivel.proficiencia}")
        listarConteudo()
    }
}
