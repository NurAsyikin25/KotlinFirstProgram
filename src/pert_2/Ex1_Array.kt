package pert_2

fun main() {
    //Array
//    var arrA = arrayOf<Int>()
//    arrA += 34
//    println(arrA[0])
//
//    var arrB = arrayOf<Int>()
//    for (i in 1..10) {
//        arrB += i
//    }
//
//    for (i in arrB) {
//        print("$i ")
//    }

    print(arrayMultidimensi())
}

// Library Array di Kotlin
fun libraryArray() {

        // Creates an Array<String> with sizes 5 and values ["0", "1", "4", "9", "16"]
        val asc = Array(5) {
                i -> (i * i).toString()
        }
        asc.forEach { println(it) }
}

fun arrayPrimitive(){
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')

// Array of int of size 5 with values [0, 0, 0, 0, 0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

// e.g. initialise the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

// e.g. initialise the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}

fun arrayMethod() {
    //Array methods
    //sort()
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')
    //sorted()
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')
    //reverse() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')
    //indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }
    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = " + simpsonsE.min())
    println("Max = " + simpsonsE.max())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}

fun array2Dimensi(){
        //initialize a 2D array
        var cinema = arrayOf<Array<Int>>()
        for (i in 0..4) {
            var array = arrayOf<Int>()
            for (j in 0..4) {
                array += 0
            }
            cinema += array
        }
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        //Filling with data
        cinema[2][2] = 1
        for (i in 1..3) {
            cinema[3][i] = 1
        }
        for (i in 0..4) {
            cinema[4][i] = 1
        }
        println()
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
}

fun arrayMultidimensi(){
    //N-dimensional arrays
    var cinemas = arrayOf<Array<Array<Int>>>()
    for (i in 0..2) {
        var cinema = arrayOf<Array<Int>>()
        for (j in 0..4) {
            var array = arrayOf<Int>()
            for (k in 0..4) {
                array += 0
            }
            cinema += array
        }
        cinemas += cinema
    }
    cinemas[1][2][3] = 1 // the second-floor cinema, the third row, the fourth seat
    var floor = 1
    for (cinema in cinemas) {
        println("Floor: $floor")
        floor += 1
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        println("-----------------")
    }
}
