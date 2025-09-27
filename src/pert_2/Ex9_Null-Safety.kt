package pert_2

/*fun main() {
    //The null value concept
    //This code won't work
    var number = 15
    number = null //This line will cause an error
}*/

/*fun main(args: Array<String>){
//Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}*/

/*fun main(args: Array<String>) {
//Null safety
//The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)
    maybeNumber = null
    println(maybeNumber!! * 2)
}*/

/*fun main(args: Array<String>) {
//Conditions
    var maybeNumber: Int? = 15
    if (maybeNumber != null)
        println(maybeNumber * 2)
    else
        println("The entered value isn't a number")
}  */

/*fun main(args: Array<String>) {
//Safe calling
//?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
//The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}*/

fun main(args: Array<String>) {
//Elvis Operator ?:
    var maybeWelcome: String? = "Hello world"

    println(maybeWelcome?.length ?: 0)
}

