//unmutable const, and Capitalized
const val PI_VALUE = 3.14

fun main() {
    println(PI_VALUE * 2)

    //remove first and last characters
    var str = "test"
    println(str.substring(1, str.length-1))
    println(str.drop(1).dropLast(1))
}