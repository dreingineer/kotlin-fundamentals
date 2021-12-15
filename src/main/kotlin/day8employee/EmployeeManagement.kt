package day8employee

import day9utils.Department
import day9utils.EmploymentCalculator
import day9utils.Gender
import java.time.LocalDate

fun main() {
//    val employee2 = AdminEmployee("Brandon", "Cruz", "HR", LocalDate.now()).apply {
//        this.firstName = firstName.uppercase()
//    }

    //with, apply, let, run

//    with(employee2) {
//        println(firstName)
//        println(lastName)
//        println(id)
//        println(department)
//        println(isRankAndFile)
//        println(isAdmin)
//    }
    val address1 = LocationDetails(
        "Makati",
        "Metro Manila",
        "NCR",
        "1124 XYZ Building, Legaspi Village"
    )

//    val employee1 = RankAndFileEmployee("Amy", "Carter", Department.IT, LocalDate.now(), address1)
//    val employee2 = RankAndFileEmployee("Amy", "Carter", "IT", LocalDate.now())
//    println(employee1.department)

    // example after noon, private variable and setting using only function na changePermission

//    val admin = AdminEmployee("Lito", "Last", Department.HR, LocalDate.now(), address1)
//    admin.changePermissions("rankAndFile")

//    println(admin.isAdmin)

    val address2 = address1.copy(
        exactAddress = "1623 HJK Building, Salcedo Village"
    )
//    println(address1)
//    println(address2)

    //visibility modifiers
    //public - default visibility
    //private - can be seen inside the same class
    //protected - same as private but visible to subclasses (same package?)
    //internal - limits to the project isang module, visible in the same module

    //focus private public


    //activity create 3 rank and file employee instance
    //create 1 admin employee instance
//    val admin1 = AdminEmployee("admin1", "admin2", Department.IT, LocalDate.now(), address2)
//    val rnf1 = RankAndFileEmployee("rnf1", "rnf1", Department.SALES, LocalDate.now(), address1)
//    val rnf2 = RankAndFileEmployee("rnf2", "rnf2", Department.SALES, LocalDate.now(), address1)
//    val rnf3 = RankAndFileEmployee("rnf3", "rnf3", Department.SALES, LocalDate.now(), address1)

    val employeeEnum = RankAndFileEmployee("EmpEnum", "LastEnum", Department.SALES, LocalDate.of(2018, 10, 8), address2, Gender.M, 12000)
    println(employeeEnum.hiringDate)
    println(employeeEnum.department)

    employeeEnum.department.welcomeMessage()
//    employeeEnum.assignDepartment(Department.SALES)
    //or make the data type of department to Department

    //activity for gender
    println(employeeEnum.gender)

    //get months hired
    println(EmploymentCalculator.getMonthsHired(employeeEnum.hiringDate))

    //using companion object no instantiation
    println(EmploymentCalculator.monthsInYear)
    //bonus
    println(EmploymentCalculator.computeBonus(employeeEnum))
}