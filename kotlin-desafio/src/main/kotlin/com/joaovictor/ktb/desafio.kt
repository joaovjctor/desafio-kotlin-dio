package com.joaovictor.ktb

fun main() {
    val formacaoJavaBasico = Formacao(
        "Java Fundamentals",
        listOf(ConteudoEducacional(
            "Lógica de Progração com Java",
            4,
            Nivel.BASICO),
            ConteudoEducacional(
            "POO",
            12,
            Nivel.INTERMEDIARIO),
        ),
        Nivel.BASICO)
    val formacaoSQLIntermediario = Formacao(
        "Dominando SQL",
        listOf(ConteudoEducacional(
            "Introdução ao SQL",
            6,
            Nivel.BASICO),
            ConteudoEducacional(
            "Modelagem e Manipulação de Dados",
            6,
            Nivel.INTERMEDIARIO),
            ConteudoEducacional(
                "Segurança e Privacidade de Dados",
                7,
                Nivel.INTERMEDIARIO
            )
        ),
        Nivel.INTERMEDIARIO
    )

    formacaoJavaBasico.formacaoInfo()
    formacaoSQLIntermediario.listarConteudo()
}