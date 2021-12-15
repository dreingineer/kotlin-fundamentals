package day8employee

import day9utils.Department
import day9utils.Gender
import java.time.LocalDate

/**
 * This class should have the following attributes:
 * firstName
 * lastName
 * department
 * hiringDate - (cannot be modified)
 */

abstract class Employee (
    override var firstName: String,
    override var lastName: String,
    var department: Department, //day 9 discussion
    val hiringDate: LocalDate,
    var location: LocationDetails,
    val gender: Gender,
    var salary: Int
) : EmployeeInterface {

    var id: String = ""

    protected var governmentId = "SSS"
    private var officeId = "abcd123"


//    fun assignDepartment(dept: Department) {
//        department = when(dept) {
//            Department.HR -> {
//                ("$firstName has been assigned to dept")
//                "Human Resource Team"
//            }
//            Department.IT -> {
//                ("$firstName has been assigned to dept")
//                "Information Technology Team"
//            }
//            Department.ACCOUNTING -> {
//                ("$firstName has been assigned to dept")
//                "Accounting Team"
//            }
//            Department.SALES -> {
//                ("$firstName has been assigned to dept")
//                "Sales Team"
//            }
//        }
//    }

    /**
     * Create a function that shows the data of this employee
     * "Employee Name: ___ from ____ department."
     */
    fun showEmployeeData() = println("Employee Name: $firstName $lastName from $department department")

    /**
     * When this class is instantiated, Generate an id, and save as an attribute of this class
     * the id format is: first 2 letters of the firstName + - + first 2 letters of the lastName + - + 8 random digits
     */
    init {
        this.id = "${firstName.substring(0,2).uppercase()}-${lastName.substring(0,2).uppercase()}-${(10000000 until 99999999).random()}"
    }
}

class Person(override var firstName: String, override var lastName: String): EmployeeInterface {
    override fun doSomething(): String {
        TODO("Not yet implemented")
    }

}