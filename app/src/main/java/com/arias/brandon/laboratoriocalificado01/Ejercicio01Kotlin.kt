package com.arias.brandon.laboratoriocalificado01

fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    // Comparamos las dos palabras: si sus longitudes son diferentes, no pueden ser anagramas
    if (palabra1.length != palabra2.length) {
        return false // Retornamos false directamente si no tienen la misma cantidad de letras
    }

    // Convertimos ambas palabras en arreglos de caracteres y los ordenamos alfabéticamente
    val arreglo1 = palabra1.toCharArray().sorted() // Convierte 'palabra1' a arreglo de caracteres y lo ordena
    val arreglo2 = palabra2.toCharArray().sorted() // Convierte 'palabra2' a arreglo de caracteres y lo ordena

    // Comparamos los dos arreglos ordenados; si son iguales, son anagramas
    return arreglo1 == arreglo2 // Devuelve true si ambos arreglos son idénticos; de lo contrario, false
}

// Función principal para probar el programa
fun main() {
    // Probamos el primer ejemplo: "listen" y "silent"
    val resultado1 = sonAnagramas("listen", "silent") // Debería ser true porque son anagramas
    println(resultado1) // Imprime el resultado: true

    // Probamos el segundo ejemplo: "hello" y "world"
    val resultado2 = sonAnagramas("hello", "world") // Debería ser false porque no son anagramas
    println(resultado2) // Imprime el resultado: false
}
