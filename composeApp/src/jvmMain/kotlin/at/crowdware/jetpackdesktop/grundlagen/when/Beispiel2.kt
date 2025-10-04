package at.crowdware.jetpackdesktop.grundlagen.`when`

fun farbeErkennen(code: String): String {
    return when (code) {
        "R" -> "Rot"
        "G" -> "Grün"
        "B" -> "Blau"
        else -> "Unbekannter Farbcode"
    }
}

fun Beispiel2() {
    println(farbeErkennen("G")) // - Grün
}