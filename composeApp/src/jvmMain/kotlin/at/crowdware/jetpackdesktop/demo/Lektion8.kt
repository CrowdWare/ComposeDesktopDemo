package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.darkrockstudios.libraries.mpfilepicker.FilePicker
import com.darkrockstudios.libraries.mpfilepicker.MPFile

@Composable
fun Lektion8() {
    MaterialTheme {
        var showPicker by remember { mutableStateOf(false) }
        var selectedFile by remember { mutableStateOf<MPFile<Any>?>(null) }

        Column(Modifier.padding(16.dp)) {
            Button(onClick = { showPicker = true }) { Text("Datei öffnen…") }
            Spacer(Modifier.height(8.dp))
            Text("Ausgewählt: ${selectedFile?.path ?: "(keine)"}")
        }

        if (showPicker) {
            FilePicker(show = true, fileExtensions = listOf("txt", "md")) { file ->
                // Callback wenn Datei gewählt oder Picker geschlossen wurde
                selectedFile = file
                showPicker = false
            }
        }
    }
}
