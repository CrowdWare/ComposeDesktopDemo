package at.crowdware.jetpackdesktop.demo

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun Lektion1() {
    var text by remember { mutableStateOf("Hello, World!")}

    MaterialTheme {
        Button(onClick = {
            text = "Hello Desktop!"
        }) {
            Text(text)
        }
    }
}