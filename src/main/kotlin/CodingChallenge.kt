fun main() {
    isDigit("3.5")
}

fun isDigit(s:String) {
    try {
//        val parseInt = s.toInt()
//        println("Parsed int $parseInt")

        var numberThree = s
        println(numberThree::class.simpleName)
    } catch(e:NumberFormatException) {
        println(e.localizedMessage)
    }
}