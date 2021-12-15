package day8activityafternoon

interface PeopleInterface {
    val fname:String
    val lname:String
    fun statusCheck():String
    fun changePermission(permissionType:People)
}