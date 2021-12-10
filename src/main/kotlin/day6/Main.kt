package day6

fun main() {
    val pokemon1 = Pokemon("Bulbasaur", "Grass")
    println("New pokemon encountered: ${pokemon1.name}" )
    println("Pokemon type: ${pokemon1.type}")

    val pokemon2 = Pokemon("Charmander", "Fire")
    println("New pokemon encountered: ${pokemon2.name}")
    println("Pokemon type: ${pokemon2.type}")

//    pokemon2.tackle()

    // bulbasaur, charmander
    startBattle(pokemon1, pokemon2)
}

fun startBattle(challenger: Pokemon, champion: Pokemon) {
    // habang wala pang fainted pokemon
    while(!challenger.hasFainted() || !champion.hasFainted()) {
        //bulbasaur
        var damage = challenger.tackle()
        //charmander was tackled -10
        champion.healthPoints -= damage
        println("${champion.name} health is ${champion.healthPoints}")
        // pag nag zero break na at declare panalo
        if(champion.hasFainted()) {
            println("#########################################################")
            println("${champion.name} has fainted!, ${challenger.name} wins!")
            println("#########################################################")
            break
        }

        damage = champion.tackle()
        challenger.healthPoints -= damage
        println("${challenger.name} health is ${champion.healthPoints}")
        if(challenger.hasFainted()) {
            println("#########################################################")
            println("${challenger.name} has fainted! ${champion.name} wins!")
            println("#########################################################")
            break
        }
    }
}

