package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberDialogState

@Composable
fun Lektion6() {
    MaterialTheme {
        var open by remember { mutableStateOf(false) }
        val dlgState = rememberDialogState(
            position = WindowPosition(Alignment.Center),
            size = DpSize(420.dp, 260.dp)
        )

        Column(Modifier.padding(16.dp)) {
            Button(onClick = { open = true }) { Text("Einstellungen…") }
        }

        if (open) {
            Dialog(
                onCloseRequest = { open = false },
                state = dlgState,
                resizable = true,      // Desktop‑typisch
                undecorated = false    // Fensterrahmen ja/nein
            ) {
                Surface {
                    Column(Modifier.padding(16.dp)) {
                        Text("Eigene Dialogoberfläche", style = MaterialTheme.typography.bodyLarge)
                        Spacer(Modifier.height(12.dp))
                        Text("Hier kannst du jede beliebige Compose‑UI verwenden.")
                        Spacer(Modifier.height(16.dp))
                        Row {
                            Spacer(Modifier.weight(1f))
                            TextButton(onClick = { open = false }) { Text("Schließen") }
                        }
                    }
                }
            }
        }
    }
}
