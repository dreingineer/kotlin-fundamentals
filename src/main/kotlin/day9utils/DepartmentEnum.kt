package day9utils

enum class Department(var shortName:String, var longName:String) {
    HR("HR", "Human Resource"),
    ACCOUNTING("ACCT", "Accounting"),
    IT("IT", "Information Technology"),
    SALES("SLS", "Sales and Marketing");

    fun welcomeMessage() {
        println("welcome to $shortName depatment")
    }
}