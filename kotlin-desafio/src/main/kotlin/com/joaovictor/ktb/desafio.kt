package com.joaovictor.ktb

fun main() {
    val usuarioA = Usuario(1, "Fulano")
    val usuarioB = Usuario(2, "Beltrano")
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
        Nivel.BASICO,
        "Este curso foi projetado para aqueles que estão começando sua jornada na programação. " +
                 "Aprenda os conceitos fundamentais de Java de uma maneira acessível e prática. " +
                 "Desenvolva habilidades sólidas que o prepararão para construir aplicativos robustos e eficientes."
    )
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
        Nivel.INTERMEDIARIO,
        "Este curso intensivo leva você além dos conceitos básicos do SQL e o mergulha em tópicos avançados de banco de dados relacional." +
                 "Aprenda a projetar esquemas de banco de dados eficientes, otimizar consultas complexas e garantir a integridade dos seus dados em qualquer ambiente."
    )

    usuarioA.matricular(formacaoJavaBasico)
    usuarioA.matricular(formacaoSQLIntermediario)
    usuarioB.matricular(formacaoSQLIntermediario)

    usuarioA.definirInteresses(
        AreasDeConhecimento.DESENVOLVIMENTO_WEB,
        AreasDeConhecimento.BANCO_DE_DADOS,
        AreasDeConhecimento.DESENVOLVIMENTO_MOBILE
    )
    usuarioB.definirInteresses(
        AreasDeConhecimento.BANCO_DE_DADOS,
        AreasDeConhecimento.CIBERSEGURANCA
    )
    println("\nListando matrículas e interesses dos usuários:\n")
    usuarioA.listarMatriculas()
    usuarioA.listarInteresses()
    usuarioB.listarMatriculas()
    usuarioB.listarInteresses()
    println("\nObtendo informações das formações:\n")
    formacaoJavaBasico.formacaoInfo()
    formacaoSQLIntermediario.formacaoInfo()
    formacaoSQLIntermediario.listarConteudo()
    formacaoJavaBasico.listarMatriculados()
    formacaoSQLIntermediario.listarMatriculados()
}