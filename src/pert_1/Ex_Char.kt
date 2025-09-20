package pert_1

fun main(args: Array<String>) {
    var charA: Char = 'A'
    // println(charA == 65)

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " + strA)

    // konversi ekslplisit pada Char
    // ASCII value
    var c: Char
    var i: Int
    //konversi dari teks ke kode ASCII
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

    //konversi dari ASCII ke text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}