package pert_1

fun main() {
    val myName: String = "Nur Asyikin"
    for (chr in myName){
        print(chr)
    }
    print('\n')

    //menggabungkan String dengan tipe data lain dengan operator +
    //val s = "abc" + 1
    //println(s + "def")

    //raw String
//    var text = """
//        for (c in "foo")
//            print(c)
//    """
//    println(text)

    //menghapus spasi dalam raw string
    var text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()
    println(text)


    //String templates
    val a = 7
    val b = 8
    val c = a+b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a+b}")
    val price = """
        ${'$'}9.99
    """.trimIndent()
    println(price)
}

fun anggotaSring() {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))
//toUpperCase() and toLowerCase()
    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))
//replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")
//substring()
    println("I would not banish all of these Internets.".substring(2, 7))
//compareTo()
    println("alpha".compareTo("bravo"))
}

