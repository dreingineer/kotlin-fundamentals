package day3

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    //loop method of collection
    //foreach ->
    numbers.forEach{
        //it container variable
//        println(it)
        // or
        number -> val newNumber = number * 15
        println(newNumber)
    }

    //map -> will return new collection, performing the transformation
    val mapped = numbers.map {
        it * 2
    }
    println(mapped)

    val evenNumbers = numbers.filter {
        it % 2 == 0
    }
    println(evenNumbers)
}