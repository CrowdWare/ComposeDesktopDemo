package at.crowdware.jetpackdesktop.grundlagen.`when`

fun zahlZuWort(zahl: Int): String {
    return when (zahl) {
        1 -> "Eins"
        2 -> "Zwei"
        3 -> "Drei"
        else -> "Unbekannt"
    }
}