package day6

class Pokemon(val name: String, val type: String) {
    //var name = name
    //var type = type
    // val const/read only; var mutable

    var healthPoints = 100
    var attackPoints = 10

    fun tackle(): Int {
        println("$name attacked with $attackPoints damage")
        return  attackPoints
    }

    fun hasFainted(): Boolean {
        return healthPoints <= 0
    }
}