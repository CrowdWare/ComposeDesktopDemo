package at.crowdware.jetpackdesktop.grundlagen.dataclasses

data class Person(val name: String, val alter: Int)

val lea = Person("Lea", 29)

fun Beispiel1() {
    println(lea) // -> Person(name=Lea, alter=29)
    println(lea.name) // -> Lea
    println(lea.alter) // -> 29

    val ältereLea = lea.copy(alter = 30)
    println(ältereLea) // -> Person(name=Lea, alter=30)
}