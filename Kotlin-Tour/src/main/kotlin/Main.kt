fun main() {
    val name = "Mary" //val for a variable whose value ever changes
    var age = 20      //var for a variable whose value can be modified
    println("$name is ${age+1} years old")

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
    val decimal:Int
    val check =true
    if(check){
        decimal = 1
    }else{
        decimal = 2
    }
    println(decimal)

    val a1 = 1
    val b2 = 2
    println(if (a1 < b2) a else b) //Returns a value: 2

    //when condition in Kotlin
    val obj = "Hello"
    when(obj){
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown") // Default statement
    }
    val obj1 = "1"
    val result = when(obj1){
        "1" -> "One number"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result)
    // when condition used as an expression
    val temp = 18
    val description = when{
        temp < 0 -> "cold"
        temp < 10 -> "warm"
        temp < 20 -> "hot"
        else -> "Damn hot"
    }
    println(description)
    //Ranges LOOP
    //For
    for (number in 0..100 step 10){ // For Each? Ye that's foreach loop dayum
        print("$number ")
    }
    println()
    val cakes = listOf<String>("carrot", "strawberry", "chocolate")
    for (cake in cakes){
        println("Yummy, it's a $cake cake!")
    }
    //While
    var cakesEaten = 0 // Use the var key to modify the variable
    var cakesBaked = 0
    while(cakesEaten < 3){
        println("Eat a cake")
        cakesEaten++
    }
    do{
        println("Bake a cake")
        cakesBaked++
    }while (cakesBaked < cakesEaten)
    //Exercise 2

    var pizzaSlices = 0
    pizzaSlices++
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while ( pizzaSlices < 8 )
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    //Exercise 3
    for (number in 1..100){
        println( when{
            number % 15 == 0 -> "fizzbuzz"
            number % 3 == 0 ->"fizz"
            number % 5 ==0 -> "buzz"
            else -> number.toString()
        })
    }
    //Exercise 4
    val words = listOf<String>("dinosaur","limousine","language")
    for (word in words){
        if (word.startsWith('l')){
            println(word)
        }
    }
    //Functions
   Hello()
    println(sum(1,2))



    helloWorld("println")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}

fun Hello(){
    return println("Hello World!")
}
fun sum(x:Int,y:Int):Int{
    return x+y
}
fun helloWorld(input: String):String{
    return input
}
fun printMessageWithPrefix(message: String, prefix:String="Info"){
    println("[$prefix] $message")
}