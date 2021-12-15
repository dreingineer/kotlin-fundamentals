package day9SchoolManagement

class TeacherManagement {
    val teachers = mutableListOf<Teacher>()
    init {
        teachers.add(Teacher("1","Obi-wan","Kenobi", Subject.MATH))
        teachers.add(Teacher("2","Master","Buuten", Subject.ENGLISH))
        teachers.add(Teacher("3","Mary","Thompkins", Subject.SOCIALSCIENCE))
    }

    fun findTeacher() {
        val teacher = teacherList.find { it.teacherId == "3" }
        println(teacher.firstName)
    }
}