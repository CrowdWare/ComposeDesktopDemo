package at.crowdware.jetpackdesktop.demo

import Lektion3
import Lektion4
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun printUsage() {
    println("""
        Jetpack Compose Lektionen

        Aufruf:
          demo <lektion> 
         
        Beispiel:
          demo 1
          demo 2
    """.trimIndent())
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printUsage()
        return
    }

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Jetpack Compose Lektionen",
        ) {
            when (args[0]) {
                "1" -> Lektion1()
                "2" -> Lektion2()
                "3" -> Lektion3()
                "4" -> Lektion4()
                else -> println("Lektion $args[0] ist nicht vorhanden")
            }
        }
    }
}