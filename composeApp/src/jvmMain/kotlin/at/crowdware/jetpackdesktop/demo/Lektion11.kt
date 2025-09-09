package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Lektion11() {
    LazyColumn {
        items(100) { index ->
            Text("Zeile #$index", modifier = Modifier.padding(8.dp))
        }
    }
}