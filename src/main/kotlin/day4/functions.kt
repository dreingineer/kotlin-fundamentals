package day4

fun main() {
    //functions for ATMS
    //check balance -> your balance is: ____"
    //deposit -> "you just deposited ____. your new balance is: ____"
    //withdrawal -> "your new balance is: ____"

    val account = mutableMapOf<String, Any>(
        "usernane" to "Brandon",
        "balance" to 0
    )

    println(checkBalance(account))
    println(deposit2(account, 500))
    println(checkBalance(account))
    println(deposit2(account, -100))
//    println(withdraw(account,200))
//    println(deposit2(account, 50000))
}

fun checkBalance(account: MutableMap<String, Any>): String {
    return "Your balance is ${account.getValue("balance")}"
}

//unit = void
fun deposit(account: MutableMap<String, Any>, amount: Int): Unit {
//    var newBalance = account.getValue("balance") + amount
//    //set the new balance to the balance
//    account.put("balance", newBalance)
//    return "You just deposited $amount. Your new balance is $newBalance"
//    println()

}

//deposit:
//1. cannot deposit more than 5000
//2. cannot deposit amount not divisible by 100
//3. cannot deposit negative amount
fun deposit2(account: MutableMap<String, Any>, depositAmount: Int): String {
    if(depositAmount > 5000 || !(depositAmount % 100 == 0) || depositAmount < 0) {
        return "invalid deposit amount!"
    } else  {
        val newBalance = account.getValue("balance").toString().toInt() + depositAmount
//        account.put("balance", newBalance)
        account["balance"] = newBalance
        return "You deposited $depositAmount. Your new balance is $newBalance"
    }
}

//withdraw:
//1. cannot withdraw more than half of the current amount
//2. cannot withdraw negative amount
fun withdraw(account: MutableMap<String, Any>, withdrawAmount:Int): String {
    val currentCheck = account.getValue("balance").toString().toInt()
    val half = currentCheck / 2
    if(withdrawAmount > half || withdrawAmount < 0) {
        return "invalid withdraw amount"
    } else {
        val newBalance = account.getValue("balance").toString().toInt() - withdrawAmount
//        account.put("balance", newBalance)
        account["balance"] = newBalance
        return "You withdrawn $withdrawAmount. Your new balance is $newBalance"
    }
}