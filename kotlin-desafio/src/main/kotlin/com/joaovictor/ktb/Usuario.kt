package com.joaovictor.ktb

data class Usuario(val id: Int, val nome: String) {
    val areasDeInteresse = mutableSetOf<ConteudoEducacional>()
}
