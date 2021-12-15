package day9utils

import day8employee.Employee
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class EmploymentCalculator  {

    //you can call this in other classes w/o instantiation
    companion object {
        val monthsInYear =12
        val grossAnnualPercentage = .1

        //Create a function that computes
        //no of months the employee has stayed in the company

        //need to be typecasted to long
        fun getMonthsHired(hiringDate: LocalDate): Long {
            return ChronoUnit.MONTHS.between(hiringDate, LocalDate.now())

        }

        //    fun computeBonus(salary:Int, hiringDate: LocalDate) {
        //10% gross annual
        //5% tenure (months)
        //salary Int
        //val gross = salary * 12 * .1
        //val tenureBonus = empoyee.salary * tenure * .05
        //return gross + tenureBonus
//    }
        fun computeBonus(employee: Employee) : Double {
//        val monthsInYear =12
//        val grossAnnualPercentage = .1
            val tenure = getMonthsHired(employee.hiringDate)

            val annualGross = employee.salary * monthsInYear * grossAnnualPercentage
            val tenureBonus =employee.salary * tenure * .05

            return annualGross + tenureBonus
        }
    }

    //cannot be called outside the companion object
}