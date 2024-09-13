package app.mnr.view.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import app.mnr.R
import app.mnr.view.elements.MNRHorizontalDivider
import kotlin.random.Random

private fun calcSol(currentValue: Int, adjustment: Int): Int {
    val selectedSol = currentValue + adjustment
    if (selectedSol > 8000) return 8000
    if (selectedSol < 1) return 1
    return selectedSol
}

@Composable
fun ExploreScreen(navController: NavController) {
    val rovers = listOf("Curiosity", "Opportunity", "Spirit")
    var selectedRover by remember { mutableStateOf(rovers[0]) }
    var selectedSol by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {

        Row(verticalAlignment = CenterVertically) {
            // SET MARTIAN SOL: TITLE
            Text(
                text = stringResource(id = R.string.explore_set_martian_sol_title),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Black,
                modifier = Modifier.padding(20.dp)
            )
            // VALUE
            Text(
                text = selectedSol.toString(),
                fontSize = 22.sp,
                fontWeight = FontWeight.Normal,
                color = Black,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
            )
        }

        // SET MARTIAN SOL: BUTTONS
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = CenterVertically
        ) {

            // Addition Column
            Column(
                modifier = Modifier
                    .padding(end = 20.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                // +100
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, 100) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) { Text("+100", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }

                // +10
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, 10) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) { Text("+10", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }

                // +1
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, 1) },
                    modifier = Modifier
                        .fillMaxWidth()
                ) { Text("+1", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }
            }

            // Random Button
            Box(
                modifier = Modifier
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { selectedSol = Random.nextInt(from = 1, until = 8000) },
                    modifier = Modifier
                        .background(color = colorResource(id = R.color.white))
                        .fillMaxWidth()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_dice_random),
                        contentDescription = "Random Martial Sol Button"
                    )
                }

            }

            // Subtraction Column
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                // -100
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, -100) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) { Text("-100", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }

                // -10
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, -10) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) { Text("-10", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }

                // -1
                Button(
                    onClick = { selectedSol = calcSol(selectedSol, -1) },
                    modifier = Modifier
                        .fillMaxWidth()
                ) { Text("-1", fontSize = 18.sp, color = White, textAlign = TextAlign.Left) }
            }


        }

        MNRHorizontalDivider()

        // SELECT ROVER - TITLE
        Text(
            text = "SELECT ROVER",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.padding(20.dp)
        )

        // SELECTED ROVER - RADIAL LIST
        Column(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            rovers.forEach { rover ->
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = CenterVertically
                ) {
                    RadioButton(
                        selected = selectedRover == rover,
                        onClick = { selectedRover = rover },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = colorResource(id = R.color.selected),
                            unselectedColor = colorResource(id = R.color.selectable)
                        ),
                        modifier = Modifier.selectable(
                            selected = selectedRover == rover,
                            onClick = { selectedRover = rover }
                        )
                    )
                    Text(text = rover, fontSize = 16.sp, color = Black)
                }
            }
        }

        MNRHorizontalDivider()

        // SEARCH BUTTON
        Button(
            onClick = { navController.navigate("search/$selectedRover/$selectedSol") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                stringResource(id = R.string.explore_search_button_text),
                fontSize = 18.sp,
                color = White
            )
        }
    }
}