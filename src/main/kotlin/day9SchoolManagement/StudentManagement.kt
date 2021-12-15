package day9SchoolManagement

class StudentManagement {
    val students = mutableListOf<Student>()
    init {
        students.add(Student("1","first","last", GradeLevel.I))
        students.add(Student("2","Willie","Revillame", GradeLevel.I))
        students.add(Student("3","Bong","Go", GradeLevel.I))
        students.add(Student("4","Dante","Joo", GradeLevel.II))
        students.add(Student("5","Lisa","Megan", GradeLevel.II))
    }
}