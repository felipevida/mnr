package app.mnr.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import app.mnr.R

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation(backgroundColor = Color.White) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            horizontalArrangement = Arrangement.SpaceEvenly,
            Alignment.Bottom
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.homenavico),
                        contentDescription = "Home"
                    )
                },
                label = { Text("HOME") },
                selected = true,
                selectedContentColor = colorResource(id = R.color.selected),
                unselectedContentColor = colorResource(id = R.color.selectable),
                modifier = Modifier.padding(20.dp),
                onClick = { navController.navigate("home") }
            )

            NavDivider()

            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.explorenavico),
                        contentDescription = "Explore"
                    )
                },
                label = { Text("EXPLORE") },
                selected = false,
                selectedContentColor = colorResource(id = R.color.selected),
                unselectedContentColor = colorResource(id = R.color.selectable),
                modifier = Modifier.padding(20.dp),
                onClick = { navController.navigate("explore") }
            )

            NavDivider()

            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.savednavico),
                        contentDescription = "Saved"
                    )
                },
                label = { Text("SAVED") },
                selected = false,
                selectedContentColor = colorResource(id = R.color.selected),
                unselectedContentColor = colorResource(id = R.color.selectable),
                modifier = Modifier.padding(20.dp),
                onClick = { navController.navigate("saved") }
            )
        }
    }
}

@Composable
fun NavDivider() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(1.dp)
            .background(color = colorResource(id = R.color.divider))
    )
}
