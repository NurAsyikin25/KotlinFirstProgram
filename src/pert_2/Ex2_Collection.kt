package pert_2

//fun printAll(strings: Collection<String>) {
//    for(s in strings) print("$s ")
//    println()
//}
fun main(args: Array<String>) {
//    val stringList = listOf("one", "two", "one")
//    printAll(stringList)
//    val stringSet = setOf("one", "two", "three")
//    printAll(stringSet)

    print(map())
}

fun list(){
        val numbers = listOf("one", "two", "three", "four")
        println("Number of elements: ${numbers.size}")
        println("Third element: ${numbers.get(2)}")
        println("Fourth element: ${numbers[3]}")
        println("Index of element \"two\" ${numbers.indexOf("two")}")
//List elements (including nulls) can duplicate
        val bob = Person("Bob", 31)
        val people = listOf<Person>(Person("Adam", 20), bob, bob)
        val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
        println(people == people2)
        bob.age = 32
        println(people == people2)
    }
    class Person(var name: String, var age: Int){}

fun mutableListOf(){
    //MutableList is a List with list-specific write operations
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") // this is OK
//numbersStr = mutableListOf("six", "seven") // compilation error
    println(numbersStr)
}

fun arrayListOf(){
    //Array lists (mutable) bisa diubah
    /*
    Method:
    clear(), contains(), size, get() or [], add() or +=, remove() or -=,
    removeAt(), toTypedArray(), lastIndexOf(), removeAll(), reverse()
    */
    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array : ")
    for(item in arrayList){
        print("$item ")
    }
    print("\n")
    arrayList += 9

    print("Tambahkan elemen 9 dalam arrayList : ")
    println(arrayList)
    arrayList.reverse()
    print("Reverse arrayList : ")
    println(arrayList)
    arrayList -= 1 // We can delete!
    print("Remove last element in arrayList : ")
    println(arrayList)
    arrayList += (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}

fun set(){
    //Set<T> stores unique elements; their order is generally undefined.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
//The default implementation of Set – LinkedHashSet – preserves the order of elements insertion
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
    val strings = hashSetOf("a", "b", "c", "c") //hash set value unik
    println("My Set Values are"+strings)
}

fun map(){
    //Map<K, V> is not an inheritor of the Collection interface;
    /*
    Map stores key-value pairs (or entries);
    keys are unique, but different keys can be paired with equal values.
    */
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous
//wo maps containing the equal pairs are equal regardless of the pair order.
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap == anotherMap}")
//MutableMap is a Map with map write operations, for example,
//you can add a new key-value pair or update the value associated with the given key
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // prints "1"
}

