package at.crowdware.jetpackdesktop.grundlagen.bedingungen

fun sichereAddition(a: Int, b: Int): Int {
    if (a >= 0 && b >= 0) {
        return a + b
    } else {
        return 0
    }
}