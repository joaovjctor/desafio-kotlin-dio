package com.joaovictor.ktb

fun main() {
    var formacao = Formacao("Java", listOf(ConteudoEducacional("POO", 60)), NivelFormacao.INTERMEDIARIO)
    var usuario = Usuario(1, "joao")
    formacao.matricular(usuario)
    println(formacao.listarMatriculados().toString())
    println(formacao.listarConteudo().toString())
}