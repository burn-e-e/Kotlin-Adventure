fun main() {
    val name = "Mary"
    val age = "20"
    println("$name is $age years old")

    //Basic Types
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean= false
    val f: Char = '\n'

    //Collections
        //List
    val readOnlyShapes = listOf("Triangle","Square","Circle")
    val shapes:MutableList<String> = mutableListOf("Triangle","Square","Circle")
    println("The First item in the list is: ${readOnlyShapes[0]}")
    println()
}