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
    //Map
    val readOnlyAccountBalance = mapOf(1 to 200, 2 to 444, 3 to 100)
    val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100,2 to 200, 3 to 100)
    println("The first value in the map is: ${readOnlyAccountBalance[2]}")
    println("The first value in the map is: ${readOnlyAccountBalance[3]}")
    println("This map has ${readOnlyAccountBalance.count()} key-value pairs")
    println(accountBalances)
    accountBalances.put(4,400)
    println(accountBalances)
    accountBalances.remove(2)
    println(accountBalances)
    readOnlyAccountBalance.containsKey(2)
    println(readOnlyAccountBalance.keys)
    println(readOnlyAccountBalance.values)

    println(2 in readOnlyAccountBalance.keys)
    println(100 in readOnlyAccountBalance.values)
    //Practice
    //Exercise1
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)
    //Exercise2
    val SUPPORTED = setOf("HTTP","HTTPS","FTP")
    val requested = "smtp"
    val isSupported = requested in SUPPORTED
    println("Support for ${requested.uppercase()}: $isSupported")
    //Exercise3
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")

    //Control Flow
}