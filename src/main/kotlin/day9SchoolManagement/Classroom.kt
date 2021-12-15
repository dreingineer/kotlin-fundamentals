package day9SchoolManagement

class Classroom (
    val roomId: String,
    val roomNumber: String,
    val name: String,
    val capacity: Int,
    val adviser: Teacher,
//    val student: MutableList<Student>,
    val roomType: RoomType
    ) {
    val student: MutableList<Student> = mutableListOf()
}