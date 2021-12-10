fun main() {
    println("${6 * 2}")
    //arithmetic
//    val numByte = Byte.MAX_VALUE
//    val numShort = Short.MAX_VALUE //32767
//    val numLong = Long.MAX_VALUE
//    val numFloat = Float.MAX_VALUE //1.23F
//    val numDouble = Double.MAX_VALUE //1.23

    //use is MDAS
    //val result = numLong * numShort //overflow

    val numByte = 1
    val numShort = 2
    var numLong = 7
    val numFloat = 1.23F
    val numDouble = 4

//    println(result::class.simpleName)
//    var result = numLong + numShort
    var result = numLong.plus(numShort)
    println(result)

    result = numLong - numShort
    println(result)

    result = numLong * numShort
    println(result)

    result = numLong / numShort
    println(result)

    result = numLong % numShort
    println("${numLong} % ${numShort} is = ${result}")

    println(numLong++)
    println(numLong)
    println(++numLong)

    var number1 = 12
    var number2 = 3

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    number1 += number2
    println(number1)

    number1 -= number2
    println(number1)

    // check for century
    var num1 = 1705
    var num2 = 100

    result = num1 / num2
    println(result)
    //======================


    //logical
    //comparison
    //assignment
    //unary or augmented
    //boolean
    getCentury(1705)
}

fun getCentury(number:Int): Int {
    return if(number %100 == 0) number / 100 else (number /100) + 1
}

fun twiceAsOld(fatherAge:Int, sonAge:Int): Int {
    return 1
}