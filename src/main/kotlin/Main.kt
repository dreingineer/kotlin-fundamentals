fun main(args: Array<String>) {

    println("Hello World")

    // Collections - group of related data
    // immutable vs. mutable
    // Immutable -> Airlines = ["Cebu Pacific", "PAL", "Airasia"]
    // mutable kung ilan ung kailangang data
    // Mutable -> Users = []

    // List, Set, Map
    // list basic collection, oredered collection that can be accessed by indeces; collection interfaces

//    val airlines: List<String> = listOf("Cebu Pacific", "PAL", "Airasia")
//    println(airlines)
//
//    println(airlines[1])
//    println(airlines.size)
    //no add thats why immutable

    //mutable
//    val terminals: MutableList<Int>  = mutableListOf<Int>(1, 2, 3, 4)
//    terminals.add()
//    terminals.removeAt()
//    terminals.remove()

//    println(terminals)
//    println(terminals.add(5))
//    println(terminals)
//    println(terminals.contains(2))
//
//    val fruits = listOf("Banana", "Orange", "Lemon", "Papaya")
//    println(fruits)
//    println(fruits[1])
//    println(fruits.size)
//    println(fruits.equals("Banana"))
//    println(fruits.indexOf("Banana"))
//    println("have fruit? " + fruits.contains("Banana"))
//    println(fruits.isEmpty())
//
//
//    val cats = mutableListOf<String>("Raffy", "Kala", "Picci")
//    println(cats)
//    println(cats.add("Prince Added"))
//    println(cats)
//    println(cats.add("Remove Me"))
//    println(cats)
//    println(cats.removeAt(4) + " deleted")
//    println(cats)
//    println(cats.isEmpty())
//    println(cats.removeAll(cats))
//    println(cats.isEmpty())
//    println(cats)

    // set of; immutable
    val usernames: Set<String> = setOf("brandon", "amelia", "charlie")
    println(usernames)
    println(usernames.size) //count of usernames
    println(usernames.ifEmpty {  })
    println(usernames.toString()) // convert to string
    println(usernames.contains("amelia")) //if present
    println(usernames.count()) //count
    println(usernames.singleOrNull())
    println(usernames.first()) //first element
    println(usernames.last()) //last element

    println("=============================================================")
    //mutable
    val students: MutableSet<String> = mutableSetOf("brandon", "amelia", "charlie")
    println(students.add("Alex"))
    println(students)
    println(students.add("Brandon"))
    println(students)
    println(students.add("brandon"))
    println(students)
    println(students.add("amelia"))
    println(students)
    println(students.shuffled()) //shuffle set
    println(students)
    println(students.clear()) //clear set
    println(students)


    // map key -> value pairs
    // student details: firstName, lastName, yrLevel, section
    // "Brandon", "Diaz", "first", "A"

    //immutable
//    val studentDetails: Map<String, String> = mapOf(
//        "firstName" to "Brandon",
//        "lastName" to "Diaz",
//        "yrLevel" to "first",
//        "section" to "A"
//    )
//    println(studentDetails)
//    println(studentDetails.keys)
//    println(studentDetails.values)

    //mutable
    val studentDetails: MutableMap<String, String> = mutableMapOf(
        "firstName" to "Brandon",
        "lastName" to "Diaz",
        "yrLevel" to "first",
        "section" to "A"
    )

    println(studentDetails)
    studentDetails.put("Status", "Single") // put, add or edit
    println(studentDetails)
    studentDetails.remove("Status") // remove
    println(studentDetails)
    println(studentDetails.toString()) // to string
    println(studentDetails.replace("firstName", "Nate")) //replace value to key
    println(studentDetails)
    studentDetails.put("section", "X")
    println(studentDetails)

    println("=============== my immutable map ===================")
    val catDetails: MutableMap<String, Any> = mutableMapOf(
        "nickname" to "Picci",
        "age(year)" to 1,
        "breed" to "puspin",
        "isSpayed" to true,
        "color" to "bicolor",
        "cattitude" to "tamed loyal and friendly cat. always following her master",
        "favFood" to "princess dry food"
    )

    println(catDetails)
    println(catDetails.toString())
    println(catDetails.remove("favFood")) // delete D
    println(catDetails) // Read
//    println(catDetails.put("favFood", "whiskas")) //add key value pair C
//    println(catDetails)
    catDetails.put("favFood", "whiskas" ) // add removed key favFood
    println(catDetails) // Read
    catDetails.put("owner", "andrei") // add new key owner
    println(catDetails) // Read
    catDetails.put("favFood", "whiskas and special cat") // edit favFood U
    println(catDetails)
    catDetails.replace("nickname", "piccipie") // replace value U
    println(catDetails)


}