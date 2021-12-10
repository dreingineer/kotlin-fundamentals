fun main() {
    val isNotChristmas = false
    val isChristmas = true

    println(!isChristmas)

    println(!isChristmas && !isChristmas)
    println(isChristmas && isChristmas)
    println(isChristmas && !isChristmas)

    println(!isChristmas || !isChristmas)
    println(isChristmas || isChristmas)
    println(isChristmas || !isChristmas)

    println(isChristmas.and(isNotChristmas))
    println(isChristmas.and(false))

    //boolean functions kotlin....
    

}