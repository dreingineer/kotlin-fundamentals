package day8employee

interface EmployeeInterface {
    //abstract method
    val firstName:String //needs to override to the implementing class
    val lastName:String //needs to override to the implementing class
    fun doSomething():String
}
