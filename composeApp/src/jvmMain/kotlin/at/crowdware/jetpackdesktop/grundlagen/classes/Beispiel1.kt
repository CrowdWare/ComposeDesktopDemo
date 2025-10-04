package at.crowdware.jetpackdesktop.grundlagen.classes

class Katze(val name: String, var hunger: Int) {


    fun miauen() {
        println("$name sagt: Miau!")
    }
    fun fuettern() {
        hunger = 0
        println("$name ist jetz satt")
    }
}

fun Beispiel1() {
    val luna = Katze("Luna", 10)
    luna.miauen() // Luna sagt: Miau!
    luna.fuettern() // Luna ist jetzt satt
}