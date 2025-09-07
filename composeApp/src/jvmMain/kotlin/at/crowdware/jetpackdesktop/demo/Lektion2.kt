package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Lektion2() {
    var inputText by remember { mutableStateOf("") }

    MaterialTheme {
        Column {
            TextField(
                value = inputText,
                onValueChange = {inputText = it},
                label = { Text("Dein Text")})
            Spacer(modifier = Modifier.height(16.dp))
            Text("Du hast geschrieben: $inputText")
        }
    }
}