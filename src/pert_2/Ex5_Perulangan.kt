package pert_2

fun main() {
    //print(forLoop())
    //print(tabelPerkalian())
    //print(kalkulatorEksponensial())
    //print(whileLoop())
    print(kalkulatorWhile())
}

fun forLoop(){
    //The for loop
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')
    print('\n')
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array " +i)

    print('\n')
    val listInt = listOf(1, 22, 83, 4)
    for ((index, value) in listInt.withIndex()) {
        println("the element at $index is $value")
    }
}

fun tabelPerkalian(){
    println("Simple multiplication table using loops:")
    for (i in 1..10) {
        print("$i ")
    }
    println()
    for (i in 1..10) {
        print("${i * 2} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 3} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 4} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 5} ")
    }
    println()
    for (i in 1..10) {

        print("${i * 6} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 7} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 8} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 9} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 10} ")
    }
    println("\n\nHere's a simple multiplication table using nested loops:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}

fun kalkulatorEksponensial(){
    println("Exponent calculator")
    println("===================")
    println("Enter the base: ")
    val a = readLine()!!.toInt()
    println("Enter the exponent: ")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1..n-1) {
        result = result * a
    }
    println("Result: $result")
    println("Thank you for using our exponent calculator")
}

fun whileLoop(){
    //While Loop
    var x:Int = 0
    println("Example of While Loop--")
    while(x <= 10) {
        print("$x ")
        x++
    }
    print('\n')
//Do-While Loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do block---" +y)
    } while(y <= 50)
}

fun kalkulatorWhile(){
    println("Welcome to our calculator")
    var goOn = "yes"
    while (goOn == "yes") {
        println("Enter the first number")
        val a = readLine()!!.toDouble()
        println("Enter the second number:")
        val b = readLine()!!.toDouble()
        println("Choose one of the following operations:")
        println("1 - addition")
        println("2 - subtraction")
        println("3 - multiplication")
        println("4 - division")
        val choice = readLine()!!.toInt()
        var result: Double = 0.0
        when (choice) {
            1 -> result = a + b
            2 -> result = a - b
            3 -> result = a * b
            4 -> result = a / b
        }
        if ((choice > 0) && (choice < 5)) {
            println("Result: $result")
        } else {
            println("Invalid choice")
        }
        println("Would you like to make another calculation? [yes/no]")
        goOn = readLine()!!
    }
    println("Thank you for using our calculator.")
}