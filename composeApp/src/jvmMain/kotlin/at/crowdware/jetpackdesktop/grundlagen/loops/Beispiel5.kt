package at.crowdware.jetpackdesktop.grundlagen.loops

fun Beispiel5 () {
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }

    // Gibt 1 2 4 5
}