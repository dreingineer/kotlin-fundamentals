fun main() {
    //day quotes
//    println("What is the day today?")
//    val dayOfWeek = readLine()!!.lowercase()

    //Monday -> Hey it's Monday! Lets be productive
    //Tuesday -> Hey it's Tuesday! Choose to be happy!
    //Wednesday -> Hey it's Wednesday my dudes!
    //Thursday -> Hey it's Thursday! you're almost there!
    //Friday -> Thank God it's Friday
    //Saturday & Sunday -> Happy Weekends! Get some life!

//    when(dayOfWeek) {
//        "monday" -> {
//          println("Hey it's Monday! Lets be productive")
//          println("I'm thrilled to see you again")
//        }
//        "tuesday" -> println("Tuesday -> Hey it's Tuesday! Choose to be happy!")
//        else -> println("it's not me, it's you!")
//    }

    //Calculator
    // ask for first number
    println("Enter first number: ")
    val firstNum = readLine()!!.toDouble()

    // ask for the second number
    println("Enter first number: ")
    val secondNum = readLine()!!.toDouble()

    // ask for  the operation to be done
    println("Choose operator (+, -, *, /): ")
    val operator = readLine()!!

    //identify what operator to be used
    // perform the operation
    // display result

    when(operator) {
        "+" -> println(firstNum + secondNum)
        "-" -> println(firstNum - secondNum)
        "*" -> println(firstNum * secondNum)
        "/" -> println(firstNum / secondNum)
        else -> println("Operator is not supported")
    }

}