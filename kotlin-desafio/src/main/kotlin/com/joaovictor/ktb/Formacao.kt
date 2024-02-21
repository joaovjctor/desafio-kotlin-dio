package com.joaovictor.ktb

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: NivelFormacao) {
    private val matriculados = mutableListOf<Usuario>()

    private val lerInscritos: List<Usuario> = matriculados

    fun matricular(usuario: Usuario) {
        matriculados.add(usuario)
        println("Usuário ${usuario.nome} foi matriculado na formação $nome")
    }

    fun listarMatriculados(): List<Usuario> {
        println("Usuários matriculados na formação $nome:")
        return lerInscritos
    }

    fun listarConteudo(): List<ConteudoEducacional> {
        println("Os seguintes conteúdos fazem parte da formação $nome:")
        return conteudos
    }

    fun formacaoInfo(): String {
        return """"
            Nome: $nome
            ${listarConteudo()}
            Nível: $nivel
            """.trimIndent()
    }
}
