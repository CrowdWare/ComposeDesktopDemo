package at.crowdware.jetpackdesktop.grundlagen.bedingungen

fun checkZahl(x: Int): String {
    if (x > 0) {
        return "Die Zahl ist positiv."
    } else if (x < 0) {
        return "Die Zahl ist negativ."
    } else {
        return "Die Zahl ist null."
    }
}

fun Beispiel1 () {
    println(checkZahl(5)) // Die Zahl ist positiv.
    println(checkZahl(-2)) // Die Zahl ist negativ.
    println(checkZahl(0)) // Die Zahl ist null.
}