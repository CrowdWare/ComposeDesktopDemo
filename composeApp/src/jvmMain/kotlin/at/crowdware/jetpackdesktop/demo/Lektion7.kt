import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Lektion7() {
    MaterialTheme {
        var open by remember { mutableStateOf(false) }
        var name by remember { mutableStateOf("") }

        Column(Modifier.padding(16.dp)) {
            Button(onClick = { open = true }) { Text("Umbenennen…") }
            Spacer(Modifier.height(8.dp))
            Text("Neuer Name: ${if (name.isBlank()) "(leer)" else name}")
        }

        if (open) {
            AlertDialog(
                onDismissRequest = { open = false },
                title = { Text("Element umbenennen") },
                text = {
                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Neuer Name") },
                        singleLine = true
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = { open = false },
                        enabled = name.isNotBlank()
                    ) { Text("OK") }
                },
                dismissButton = {
                    TextButton(onClick = { open = false }) { Text("Abbrechen") }
                }
            )
        }
    }
}
