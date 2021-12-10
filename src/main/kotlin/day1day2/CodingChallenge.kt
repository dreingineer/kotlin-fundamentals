fun main() {
//    isDigit("zero")

    //======== Long to array =================
    val n:Long = 348597
    val arr = n.toString().split("")
    println(arr)
    val rev = arr.reversed()
    println(rev)
    //========================================
}

fun isDigit(s:String) = try {

//    val floatVal = stringConv.trim().toFloat()::class.simpleName
//    val intVal = stringConv.trim().toInt()::class.simpleName
//    println(floatVal)
//    println(intVal)
    if(s.trim().toFloat()::class.simpleName == "Float" || s.trim().toInt()::class.simpleName == "Int") {
        println(true)
    } else {
        println(false)
    }


} catch(e: NumberFormatException) {
    println(e)
}