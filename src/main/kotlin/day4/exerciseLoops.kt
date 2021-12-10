package day4

fun main() {
//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)

    //if the value is divisible by 3 = "ping"
    //if the value is divisible by 5 = "pong"
    //if the value is divisible by 3 and 5 = "PingPong"
    //else "x"

//    numbers.forEach {
//        if(it % 5 == 0 && it % 3 == 0) {
//            print(" $it-ping")
//        } else if(it % 5 == 0) {
//            print(" $it-pong")
//        } else if(it % 3 == 0) {
//            print(" $it-pingXpong")
//        } else {
//            print(" $it-x")
//        }
//    }

    //pwede din when
//    numbers.forEach{
//        when
//    }

    //====================================================================
//    val grades = listOf(
//        listOf(94, 82, 85),
//        listOf(83, 99, 97),
//        listOf(76, 89, 90)
//    )

//    create a loop that will return the highest grade of each subject
//    grades.forEach {
//        println(it.maxOrNull()) //highest value in the list/collection
//        println(it.maxOrNull() ?: 0) // to prevent null, use ?: 0 will return 0 instead of null


//        println(it.maxOf { result -> result }
//    }
//    val highest = grades.map {
//        grade -> grade.maxOrNull()
//    }
//    println(highest)


    //using filter, given a list from 1-1000, display all the perfect number
    //4 = 2, 1 ; 2+1 = 3 !=4
    //5 = 1 ; 1
    //6 = 1,2,3; 6

    //==========================perfect number======================================
    // exercise 3
    val numbers2 =(1..1000).toList()
    println(numbers2)

    // val never marereassign; hindi na papalitan
    // var need palitan ung value; example for summation

}

