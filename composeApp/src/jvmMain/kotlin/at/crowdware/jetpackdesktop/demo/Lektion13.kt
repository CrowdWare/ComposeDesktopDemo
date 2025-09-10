package at.crowdware.jetpackdesktop.demo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class TreeNode(
    val name: String,
    val children: List<TreeNode> = emptyList()
)

@Composable
fun TreeView(node: TreeNode, indent: Int = 0) {
    var expanded by remember { mutableStateOf(false) }

    Column {
        Row(
            modifier = Modifier
                .padding(start = (indent * 16).dp)
                .clickable {
                    if (node.children.isNotEmpty()) {
                        expanded = !expanded
                    }
                }
        ) {
            if (node.children.isNotEmpty()) {
                Text(if (expanded) "▼" else "▶")
            } else {
                Text("•")
            }
            Spacer(Modifier.width(4.dp))
            Text(node.name)
        }

        if (expanded) {
            node.children.forEach { child ->
                TreeView(child, indent + 1)
            }
        }
    }
}

@Composable
fun Lektion13() {
    val root = TreeNode(
        "Todo",
        children = listOf(
            TreeNode("Arbeit", listOf(
                TreeNode("Bericht schreiben"),
                TreeNode("Meeting vorbereiten")
            )),
            TreeNode("Privat", listOf(
                TreeNode("Einkaufen"),
                TreeNode("Sport machen")
            ))
        )
    )

    TreeView(root)
}