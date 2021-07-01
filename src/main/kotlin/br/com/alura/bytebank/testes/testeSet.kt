package br.com.alura.bytebank.testes

fun testeSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Thay", "Luiza", "Bruna", "Maria")
    val assitiramCursoKotlin: Set<String> = setOf("Thay", "Luiza", "JP", "Cassao")

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assitiramCursoKotlin)

    println(assistiramAmbos)
    println(assistiramCursoAndroid + assitiramCursoKotlin)
    println(assistiramCursoAndroid union assitiramCursoKotlin)
    println(assistiramCursoAndroid - assitiramCursoKotlin)
    println(assistiramCursoAndroid subtract assitiramCursoKotlin)
    println(assistiramCursoAndroid intersect assitiramCursoKotlin)
}