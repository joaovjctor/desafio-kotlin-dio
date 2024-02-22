package com.joaovictor.ktb

data class Usuario(val id: Int, val nome: String) {
    private val areasDeInteresse = mutableSetOf<AreasDeConhecimento>()
    private val formacoesMatriculadas = mutableSetOf<Formacao>()

    fun matricular(formacao: Formacao) {
        formacoesMatriculadas.add(formacao)
        formacao.matricularUsuario(this)
        println("Usuário $nome foi matriculado na formação ${formacao.nome}")
    }

    fun listarMatriculas() {
        println(formacoesMatriculadas.joinToString(
            prefix = "O usuário $nome está inscrito(a) nas seguintes formações:\n",
            separator = "/n"
        ) { it.nome })
    }

    fun definirInteresses(vararg interesse: AreasDeConhecimento) {
        areasDeInteresse.addAll(interesse)
    }

    fun listarInteresses() {
        println(areasDeInteresse.joinToString(
            prefix = "O usuário $nome tem interesse nas seguintes áreas de conhecimento:\n",
            separator = "\n"
        ) { it.nome })
    }
}
