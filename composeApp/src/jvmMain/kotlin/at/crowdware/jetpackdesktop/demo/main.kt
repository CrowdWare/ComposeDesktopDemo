package at.crowdware.jetpackdesktop.demo

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
                "5" -> Lektion5()
                "6" -> Lektion6()
                "7" -> Lektion7()
                "8" -> Lektion8()
                "9" -> Lektion9()
                "10" -> Lektion10()
                "11" -> Lektion11()
                "12" -> Lektion12()
                "13" -> Lektion13()
                else -> println("Lektion $args[0] ist nicht vorhanden")
            }
        }
    }
}