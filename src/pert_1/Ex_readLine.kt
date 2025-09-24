package pert_1

fun main(args: Array<String>) {
//    //Parrot program
//    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
//    println("Type something in: ");
//    var input: String
//    input = readLine()!!
//    var output: String
//    output = input + ", " + input + "!"
//    println(output)

    merubahNilaiString()
}

fun merubahNilaiString(){
    //Doubler program parsing
    println("Enter a number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt() // eventually Double
    a = a * 2
    println(a)
    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}


