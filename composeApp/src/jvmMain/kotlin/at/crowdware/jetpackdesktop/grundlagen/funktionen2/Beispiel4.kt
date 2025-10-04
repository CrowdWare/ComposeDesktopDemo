package at.crowdware.jetpackdesktop.grundlagen.funktionen2

fun motivation(name: String, aufgabe: String = "deinem Projekt") {
    println("Du schaffst das, $name - bleib dran bei: $aufgabe!")
}

fun Beispiel4() {
    motivation("Lea")
    motivation("Lea", "Kotlin lernen")
}