package ui
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
@Composable
fun BottomBar(navController: NavHostController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("home")
            },
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("timeblock")
            },
            icon = { Icon(Icons.Default.DateRange, contentDescription = "TimeBlock") },
            label = { Text("Time") }
        )
    }
}
