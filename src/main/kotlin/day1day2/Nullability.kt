fun main() {
    //important in kotlin
    // ? called optional, to accept a null value

//    var myName: String? = null

//    var input = readLine()
//    println(input!!.toInt())
//    println()

    //elvis operator, check if null
//    var input: String? = null
//    println(input?:"Default")



    // to prevent errors from happening
    try {
        val message = "Welcome to Kotlin Tutorials"
        message.toInt()
    } catch (e :NumberFormatException) {
        println(e.localizedMessage)
    } finally {
        println("With errors") // refresh memory or finish statement
    }


    //throw to force an error
    val message = "Hello world mabuhay!"
    if(message.length > 10)
        throw IllegalArgumentException("String is invalid") // you are preparing for worse
    println("Hello world") //will not be printed due to thrown error
}