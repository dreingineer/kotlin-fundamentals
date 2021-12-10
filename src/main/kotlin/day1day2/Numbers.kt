fun main() {
    val number = 8
    println(number::class.java)
    println(number::class.simpleName)

    val numberByte: Byte = 8
    println(numberByte::class.simpleName)

    val numberTwo = 800000000000000
    println(numberTwo::class.simpleName)

    val numberThree = 8.12 //double
    println(numberThree::class.simpleName)

    val numberFour = 8.12F //float
    println(numberThree::class.simpleName)

    println(8F/3)

    //byte < short < int  < long < float

    val byte1: Int = 1
    val bytetolong: Long = byte1.toLong()
    println(bytetolong)
}