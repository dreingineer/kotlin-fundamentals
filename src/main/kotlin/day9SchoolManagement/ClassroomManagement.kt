package day9SchoolManagement

class ClassroomManagement(val studentList: MutableList<Student>, val teacherList: MutableList<Teacher>) {
    val classrooms = mutableListOf<Classroom>()

    //add classroom
    fun addClassroom() {
        val classroom = Classroom("101", "101", "Jupiter", 20, teacher, RoomType.LECTURE)
        classrooms.add(classroom)
    }

    //get list
    fun getClassrooms() {
        classrooms.forEach{
            println(it.name)
        }
    }
}