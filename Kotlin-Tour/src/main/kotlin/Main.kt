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
    println("The First item in the list is: ${readOnlyShapes[0]}")
    println()
    println("The first item in the list is :${readOnlyShapes.first()}")
    println("The list has ${readOnlyShapes.count()} items")
    println("Circle" in readOnlyShapes)

    val shapes:MutableList<String> = mutableListOf("Triangle","Square","Circle")
    shapes.add("Pentagon")
    shapes.remove("Square")
    println(shapes)

    val readOnlyFruit = setOf("apple","banana","cherry")
    val fruit:MutableSet<String> = mutableSetOf("apple","banana","cherry")
    println(readOnlyFruit)
    fruit.add("grape")
    println(fruit)
    println("banana" in readOnlyFruit)
    fruit.remove("banana")
    println(fruit)
}