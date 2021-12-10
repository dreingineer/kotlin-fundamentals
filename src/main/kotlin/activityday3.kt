fun main() {
    //check highest among 3 numbers
//    println("Enter the 1st number")
//    val fnum = readLine()!!.toDouble()
//    println("Enter the 2nd number")
//    val snum = readLine()!!.toDouble()
//    println("Enter the 3rd number")
//    val tnum = readLine()!!.toDouble()
//
//    when {
//        fnum > snum && fnum > tnum -> println("$fnum is the largest")
//        snum > fnum && snum > tnum -> println("$snum is the largest")
//        else -> println("$tnum is the largest")
//    }

    //vowel or consonant
    println("Enter a letter")
    val ltr = readLine()!!.lowercase()

    println(if(ltr.equals("a") || ltr.equals("e") || ltr.equals("i") || ltr.equals("o") || ltr.equals("u")) "vowel" else "consonant")

}