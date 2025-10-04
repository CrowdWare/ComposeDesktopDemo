package at.crowdware.jetpackdesktop.grundlagen.funktionen1

fun begruessung(name: String): String {
    return "Hallo, $name!"
}

fun Beispiel2() {
    val text = begruessung("Lea")
    println(text)
}
