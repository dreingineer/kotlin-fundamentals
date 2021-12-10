fun main() {
    println("hello what is your name?")
    var name = readLine()!!

    //ask for age
    println("how old are you")
    var age = readLine()!!.toInt()

    // if user underage you're not allowed to use the service

    // check if input is less than 0
    if(age < 0 ) {
        //to handle data input try catch!
        if(age < 18 ) {
            if(age == 17) {
                println("You need a guardian!")
            } else {

                println("Sorry $name, you are not allowed to use the service")
            }
        } else {
            println("Welcome $name to this service!")
        }
    } else {
        println("Sorry, age should not be less than 0")
    }

    //if-else block with try catch
    
}