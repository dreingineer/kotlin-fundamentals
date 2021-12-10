package day7

fun main() {
    val calculator = SumCalculator()

    println(calculator.compute(1,2))
    println(calculator.compute(1.5, 3.3))
    println(calculator.compute("4", "5"))

    var listOfNumbers = listOf<Int>(1,2,3,5,8,16,21)
    println(calculator.compute(listOfNumbers))
}
//polymorphism sample
//capital S kasi class
class SumCalculator {
    fun compute (first: Int, second:Int) : Int {
        return first + second
    }

    fun compute(first: Double, second: Double) : Double {
        return first + second
        //kung int ung return type
        //return first.toInt() + second.toInt()

    }

//    fun compute(first: String, second: String) : String {
//        return first + second
//    }

    fun compute(first: String, second: String) : Int {
        return first.toInt() + second.toInt()
    }

    fun compute(list: List<Int>) : Int {
        return list.sum()
    }
}