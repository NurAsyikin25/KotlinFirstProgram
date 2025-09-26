package pert_2

fun main() {
    //print(kode1())
    //print(kode2())
    //print(kalkulatorSederhana())
    //print(contohWhen())
    print(kalkulatorWhen())
}

fun kode1(){
    //Conditions
    if (15 > 5)
        println("True")
    println("The program continues here...")

//If - Else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " + max)
//If - else if
    var myVar: Int = 0 // the variable is initialized with a value of 0
    if (myVar == 0) { // if the value is 0, we change its value to 1
        myVar = 1
    } else if(myVar == 1){ // if the value is 1, we change its value to 0
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)
    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("The number you entered is greater than 5!")
    println("Thanks for the input!")
}

fun kode2(){
    println("Enter a number between 10-20:")
    val a = readLine()!!.toInt()
    if (a >= 10 && a <= 20) {
        println("The condition has been met.")
    } else {
        println("You did it wrong.")
    }
    println("\nEnter a number between 10-20 or 30-40:")
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >=30) && (b <= 40))) {
        println("The condition has been met.")
    } else {
        println("You did it wrong.")
    }
}

fun kalkulatorSederhana(){
    println("Welcome to our calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:");
    val b = readLine()!!.toDouble()
    println("Choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")
    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1) {
        result = a + b
    } else if (choice == 2) {
        result = a - b
    } else if (choice == 3) {
        result = a * b
    } else if (choice == 4) {
        result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("result: $result")
    } else {
        println("Invalid choice")
    }
    println("Thank you for using our calculator.")
}

fun contohWhen(){
    //Use of When
    var x:Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {

        1,2 -> println("Value of X either 1,2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
}

fun kalkulatorWhen(){
    println("Welcome to our calculator")
    println("Enter the first number:");
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    val b = readLine()!!.toDouble()
    println("Choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")
    val choice = readLine()!!.toInt()
    var result = 0.0
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
    println("Thank you for using our calculator.")
}