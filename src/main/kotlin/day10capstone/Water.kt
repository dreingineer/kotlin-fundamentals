package day10capstone

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Water (
    val accountNumber:String,
    val accountName:String,
    val amountDue:Double,
) {

    var isAmountDue:Boolean = false

    fun sendCustomerBill():String {
        return "Need to pay the water bill"
    }

    val dueDate: LocalDate = LocalDate.of(2021, 12, 30)
    fun checkAmountDueDate(dueDate: LocalDate): Long {
        return ChronoUnit.DAYS.between(dueDate, LocalDate.now())
    }
}