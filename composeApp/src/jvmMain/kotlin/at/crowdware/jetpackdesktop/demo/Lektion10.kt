package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Lektion10() {
    val colors = listOf(Color.Red, Color.Green, Color.Blue, Color.Magenta)

    LazyRow {
        items(colors) { color ->
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .background(color, RoundedCornerShape(8.dp))
            )
        }
    }
}