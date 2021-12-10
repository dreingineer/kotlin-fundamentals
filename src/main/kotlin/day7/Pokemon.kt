package day7

//abstraction na tong interface
interface PokemonInterface {
    val healthPoints: Double
    var attackPoints: Double
    val defensePoints: Double

    //this
    fun tackle (enemy: Pokemon) : Double
    fun tackle (enemyDefensePoint: Double) : Double
    fun hasFainted(): Boolean
//    abstract fun attackPoints(d: Double): Any?
}

open class Pokemon(val name: String, var level: Int = 1, nickName:String = "") : PokemonInterface {
    override var healthPoints: Double = 100.0
    override var attackPoints: Double = 10.0
    override val defensePoints: Double = 1.0

    var nickName = nickName
        set(value) {
            if(value.length >= 3) {
                field = value
            } else {
                throw IllegalArgumentException("Nickname must be 3 or more")
            }
        }
        get() = "Hi! I'm $field"

    init {
        println("New pokemon encountered: $name")
    }

    private fun computeDamage(enemyDefensePoint: Double) : Double {
        return attackPoints - enemyDefensePoint
    }

    override fun tackle (enemyDefensePoint: Double) : Double {
        val damage = computeDamage(enemyDefensePoint)

        println("$name attacked and dealt $damage dmg")
        return damage
    }

    override fun tackle (enemy: Pokemon) : Double {
        val damage = computeDamage(enemy.defensePoints)

        println("$name attacked and dealt $damage dmg")
        return damage
    }

    override fun hasFainted(): Boolean {
        return healthPoints <= 0
    }

    init {
        this.healthPoints = healthPoints * level
        this.attackPoints = attackPoints * level
    }
}

// Inheritance
// We can set up a class that can inherit the attributes and the methods of its parent's class

//
class WaterTypePokemon(name: String, level: Int, nickName: String): Pokemon(name, level, nickName) {
    init {
        println("Pokemon type: Water")
    }

    fun hydroPump(): Double {
        return attackPoints / 2
    }

    override fun tackle(enemy: Pokemon): Double {
        return attackPoints + 10
    }
}

class GrassTypePokemon(name: String, level: Int, nickName: String): Pokemon(name, level, nickName) {
    init {
        println("Pokemon type: Grass")
    }

    fun vineWhip(): Double {
        return attackPoints + 5
    }

    override fun tackle(enemy: Pokemon): Double {
        return attackPoints + 20
    }
}