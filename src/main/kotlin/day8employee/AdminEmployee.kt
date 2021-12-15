package day8employee

import day9utils.Department
import day9utils.Gender
import java.time.LocalDate

// Create another class that will extend the Employee Class, name it: AdminEmployee. This class should have an attribute isRankAndFile that has a value of false. And isAdmin that has a value of true.

class AdminEmployee(
    firstName: String,
    lastName: String,
    department: Department,
    hiringDate: LocalDate,
    location: LocationDetails,
    gender: Gender,
    salary: Int
): Employee(
    firstName,
    lastName,
    department,
    hiringDate,
    location,
    gender,
    salary
) {
    var isRankAndFile = false
        private set // para hindi ma set directly!!!
    var isAdmin = true
        private set // para hindi ma set directly!!!

    //hindi overrideable ung private kahit inherited!




        fun changePermissions(permissionType: String) {
        //protected accessible sa child!
//        governmentId
        //private hindi
//        officeId

        when(permissionType) {
            "admin" -> {
                isRankAndFile = false
                isAdmin = true
            }
            "rankAndFile" -> {
                isRankAndFile = true
                isAdmin = false
            }
        }
    }

    // Return the value of isAdmin
    override fun doSomething(): String = isAdmin.toString()
}