package at.crowdware.jetpackdesktop.grundlagen.`when`

fun istWochenende(tag: String): Boolean {
    return when (tag) {
        "Samstag", "Sonntag" -> true
        else -> false
    }
}

fun  Beispiel3() {
    println(istWochenende("Montag")) // -> false
}