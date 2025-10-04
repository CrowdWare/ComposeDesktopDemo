package at.crowdware.jetpackdesktop.grundlagen.dataclasses

data class ButtonInfo(val text: String, val farbe: String)

fun Beispiel2() {
    val buttons = listOf (
        ButtonInfo("Speichern", "grün"),
        ButtonInfo("Löschen", "rot")
    )
}