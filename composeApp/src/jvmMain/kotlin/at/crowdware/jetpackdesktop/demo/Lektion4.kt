package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Lektion4() {
    MaterialTheme {
       Column {
           Text ("Willkommen in meiner App")

           Row {
               Button(onClick = { println("OK gedrückt") }) {
                   Text("OK")
               }
               Button(onClick = { println("Abbrechen gedrückt") }) {
                   Text("Abbrechen")
               }
           }
       }
    }
}