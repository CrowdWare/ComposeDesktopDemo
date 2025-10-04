package at.crowdware.jetpackdesktop.grundlagen.`when`

fun bewertung(punkte: Int): String {
    return when {
        punkte >= 90 -> "Sehr gut"
        punkte >= 75 -> "Gut"
        punkte >= 50 -> "Okay"
        else -> "Nicht bestanden"
    }
}

fun Beispiel4() {
    println(bewertung(82)) //  -> gut
}