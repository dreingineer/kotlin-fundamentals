package day8activityafternoon


fun main() {
    val ad = People("admin","admin", true)
    val rnf = People("rnf", "rnf", false)
    val rnf2 = People("rnf2", "rnf2", false)
    val rnf3 = People("rnf3", "rnf3", false)
    println(ad.statusCheck())
    println(rnf.statusCheck())
    println(rnf2.statusCheck())
    println(rnf3.statusCheck())

    ad.changePermission(ad)
    rnf.changePermission(rnf2)
    ad.changePermission(rnf)
    rnf.changePermission(rnf2)

    println(ad.statusCheck())
    println(rnf.statusCheck())
    println(rnf2.statusCheck())
}