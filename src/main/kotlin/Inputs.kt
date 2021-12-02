import java.time.LocalDate
import java.util.*

fun main () {
//    println("What is your name?")
//    val yourName = readLine()
//    println("How old are you?")
//    val yourAge = readLine()
//    println("Hi $yourName! You are $yourAge")

//    val yearNow = Calendar.getInstance().get(Calendar.YEAR)
//    val dateNow = Calendar.getInstance().get(Calendar.DATE)
//    val monthNow = Calendar.getInstance().get(Calendar.MONTH)
//
//    println("${monthNow+1}$dateNow$yearNow")
//
//    LocalDate birthDate = new LocalDate(1987, 12, 9)
//    LocalDate now = new LocalDate()

    val firstName: String = "Andrei"
    //type inference
    val lastName = "Aquino"
    //val: read-only var:read-and-write
    var weight = 160
    val myVariable: Double = 2.5
    val isTrue:Boolean = false
    //comment

    val s1 = "Call me"
    val s2 = " maybe"
    val combined = s1 + s2
    println(combined)

    val n1 = 9
    val n2 = 12
    val addtn = 9 + 12
    println(addtn)

    //strings
    val myString = "KOTLIN"
    println("$myString[0]  $myString[1]")
    println(myString[0])
    println(myString[1])
    println(myString.length)
    println(myString.substring(2,4))
    println(myString.isEmpty())
    println(myString.plus(" vs Java"))
    println("I have a string which is $myString")


    //conditionals
        val examScore = 69
    if(examScore >= 70) {
        println("You passed!")
    } else {
        println("You failed :(")
    }

    //collections
    val name1 = "Drei"
    val name2 = "Bloom"
    val name3 = "Picci"
    //immutable
    val cats = listOf<String>("Raffy", "Kala", "Ambie", "Olga")
    println(cats[3])
    //mutable list
    val devs = mutableListOf<String>("Andrei", "Bloom", "Dondon","Heji")
    devs.add("Piccie")
//    devs.add(80)

    println("List of cats:")
    for(cat in cats) {
        print("$cat ")
    }
    println("")
    println("List of devs:")
    for(dev in devs) {
        print("$dev ")
    }

    println("")
    //addition for loop, like for(int i; i<n; i++)
    for (i in 1..5) {
        print("$i ")
    }

    println("")
    for(i in 1 until 5) {
        print("$i")
    }

    println("")




    //functions
    greeting("Andrei")
    addNum(3, 19)


    //nullable
    val instagramBio:String? = null

    //check if not null?
    if(instagramBio != null) {
        println(instagramBio.uppercase())
    }

    //shortcut
    println(instagramBio?.uppercase())

}

fun greeting(ngalan:String) {
    println("Hello $ngalan")
}

private fun addNum(nm1:Int, nm2:Int) {
    val sumofnm = nm1 + nm2
    println("Sum is : $sumofnm")
}