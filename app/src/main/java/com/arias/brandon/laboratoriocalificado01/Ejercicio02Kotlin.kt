package com.arias.brandon.laboratoriocalificado01

fun contarVocales(texto: String): Int {
    // Definimos un conjunto de caracteres que son las vocales que vamos a buscar
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    // Inicializamos una variable contador para llevar la cuenta de las vocales encontradas
    var contador = 0

    // Recorremos cada carácter de la cadena de texto
    for (caracter in texto.lowercase()) {
        // Convertimos todo el texto a minúsculas para que 'A' y 'a' sean tratados igual

        // Verificamos si el carácter actual está dentro del conjunto de vocales
        if (caracter in vocales) {
            contador++ // Si es una vocal, incrementamos el contador en 1
        }
    }

    // Después de recorrer todo el texto, retornamos el número total de vocales encontradas
    return contador
}

// Función principal para probar el programa
fun main() {
    // Probamos el primer ejemplo: "Hola mundo"
    val resultado1 = contarVocales("Hola mundo") // Debería contar 4 vocales
    println(resultado1) // Imprime: 4

    // Probamos el segundo ejemplo: "Kotlin es genial"
    val resultado2 = contarVocales("Kotlin es genial") // Debería contar 6 vocales
    println(resultado2) // Imprime: 6
}
