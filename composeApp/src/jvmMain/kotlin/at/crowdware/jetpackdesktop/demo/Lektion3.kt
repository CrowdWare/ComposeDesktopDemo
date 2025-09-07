import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Lektion3() {
    MaterialTheme {
        Column {
            Text("Hallo Lea!")
            Button(onClick = { println("Button geklickt") }) {
                Text("Klick mich")
            }
        }
    }
}