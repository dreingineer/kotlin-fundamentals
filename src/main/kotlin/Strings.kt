fun main() {
    val myMessage: String = "Happy Birthday! Justin!"
    val anotherMessage: String = "Happy Birthday! Justin!"
//    println(myMessage)
//    println(myMessage.get(1))
//    println(myMessage.split(" ".toRegex())[2])
//    println(myMessage.split(" ".toRegex())[2].length)
//    println(myMessage.substring(16,22))
//    println(myMessage.compareTo(anotherMessage))
//    println(myMessage.length)
//    println(myMessage.uppercase())
//    println(myMessage.lowercase())
//
//    val givenName: String = "Andrei"
//    val surName: String = "Aquino"
//    val middleName: String = "Barcenas"
//
//    println("My full name is $givenName ${middleName.get(0)} $surName")
//    val age: Int = 33
//    println("My age 10 years from now is ${age+10}")
//
    val nickName:String = "drei"
    val product: Int = 100
    val amount: Int = 10

    println("Hey ${nickName[0].uppercase()+nickName.substring(1) }, you need to pay me ${product * amount} " +
            "pesos")
}