package day8activityafternoon

class People(
    override var fname: String,
    override var lname: String,
    private var admin: Boolean
) : PeopleInterface {

    override fun statusCheck(): String {
        return "is $fname $lname? ${admin.toString()}"
    }

    override fun changePermission(permissionType: People) {

        if(admin) {
            println("Athorized!")
            //check if parameter passed(people) is admin or not admin
            if(!permissionType.admin) {
                permissionType.admin = true
                println("${permissionType.fname} ${permissionType.lname} is now admin? ${permissionType.admin}!")
            }
        } else {
            println("Not authorized")
        }
    }

}