package day9SchoolManagement

fun main() {

    val studentList = StudentManagement().students
    val teacherList = TeacherManagement().teachers
    val classroomList =ClassroomManagement(studentList, teacherList).classrooms

    ClassroomManagement(studentList, teacherList).addClassroom()
}