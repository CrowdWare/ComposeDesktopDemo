package at.crowdware.jetpackdesktop.demo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun AccordionItem(
    title: String,
    modifier: Modifier = Modifier,
    initiallyExpanded: Boolean = false,
    content: @Composable ColumnScope.() -> Unit
) {
    var expanded by remember { mutableStateOf(initiallyExpanded) }

    // Icon-Rotation 0° (zu) -> 180° (auf)
    val rotation by animateFloatAsState(
        targetValue = if (expanded) 180f else 0f,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "chevronRotation"
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.surface, RoundedCornerShape(10.dp))
            .padding(vertical = 4.dp)
            // Sorgt dafür, dass sich der Container weich anpasst (z.B. Radius/Schatten)
            .animateContentSize(animationSpec = tween(200, easing = FastOutSlowInEasing))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { expanded = !expanded }
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Filled.ExpandMore,
                contentDescription = if (expanded) "Einklappen" else "Aufklappen",
                modifier = Modifier.rotate(rotation)
            )
        }

        // Inhalt weich ein-/ausblenden und vertikal expandieren/schrumpfen
        AnimatedVisibility(
            visible = expanded,
            enter = fadeIn(animationSpec = tween(150)) + expandVertically(animationSpec = tween(200)),
            exit  = fadeOut(animationSpec = tween(150)) + shrinkVertically(animationSpec = tween(200))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                content()
            }
        }
    }
}

@Composable
fun Lektion12() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(16.dp).fillMaxSize()
    ) {
        AccordionItem("Erste Frage") {
            Text("Das ist die Antwort auf die erste Frage.")
        }
        AccordionItem("Zweite Frage") {
            Text("Hier steht die Antwort auf die zweite Frage.")
            Spacer(Modifier.height(8.dp))
            Button(onClick = {}) { Text("Aktion") }
        }
        AccordionItem("Dritte Frage", initiallyExpanded = true) {
            Text("Diese Sektion startet geöffnet.")
        }
    }
}