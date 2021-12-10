package day7

fun main(args: Array<String>) {

    val pokemon1 = GrassTypePokemon("Bulbasaur", 1, "Bulby")
    val pokemon2 = WaterTypePokemon("Squirtle", 1, "Myrtle")
    val pokemon3 = Pokemon("Jigglypuff")

//    pokemon3.attackPoints

//    startBattle(pokemon1, pokemon2)

    pokemon2.nickName = "Tubby"
    println(pokemon3.tackle(22.0))

}

fun startBattle(challenger: Pokemon, champion: Pokemon) {

    while(!champion.hasFainted() || !challenger.hasFainted()) {

        var damage = challenger.tackle(champion)
        champion.healthPoints -= damage
        println(champion.name + "'s health is now down to " + champion.healthPoints)
        if(champion.hasFainted()) {
            println("Challenger won the battle!")
            break;
        };

        damage = champion.tackle(challenger)
        challenger.healthPoints -= damage
        println(challenger.name + "'s health is now down to " + challenger.healthPoints)
        if(challenger.hasFainted()) {
            println("Champion won the battle!")
            break;
        };

    }

    println(challenger.healthPoints)
    println(champion.healthPoints)

}