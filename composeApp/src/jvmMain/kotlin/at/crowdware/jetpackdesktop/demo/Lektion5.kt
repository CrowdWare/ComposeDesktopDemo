import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Lektion5() {
    MaterialTheme {
        var show by remember { mutableStateOf(false) }
        var deleted by remember { mutableStateOf(false) }

        Column(Modifier.padding(16.dp)) {
            Button(onClick = { show = true }) { Text("Löschen…") }
            Spacer(Modifier.height(8.dp))
            Text(if (deleted) "Status: Gelöscht" else "Status: Nichts gelöscht")

            if (show) {
                AlertDialog(
                    onDismissRequest = { show = false }, // ESC/Klick daneben
                    title = { Text("Bist du sicher?") },
                    text = { Text("Dieser Vorgang kann nicht rückgängig gemacht werden.") },
                    confirmButton = {
                        TextButton(onClick = { deleted = true; show = false }) { Text("Löschen") }
                    },
                    dismissButton = {
                        TextButton(onClick = { show = false }) { Text("Abbrechen") }
                    }
                )
            }
        }
    }
}

