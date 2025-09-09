package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Lektion9() {
    val names = listOf("Lea", "Alex", "Chris", "Pat", "Sam")

    LazyColumn {
        items(names) { name ->
            Text(
                text = "Hallo $name",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}