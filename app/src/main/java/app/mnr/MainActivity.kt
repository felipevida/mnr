package app.mnr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.mnr.theme.MarsRoverPhotosTheme
import app.mnr.ui.saved.SavedScreen
import app.mnr.view.BottomNavigationBar
import app.mnr.view.explore.ExploreScreen
import app.mnr.view.explore.search.ResultsScreen
import app.mnr.view.explore.search.ResultsViewModel
import app.mnr.view.home.HomeScreen
import app.mnr.view.saved.SavedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MarsRoverPhotosApp()
        }
    }
}

@Composable
fun MarsRoverPhotosApp() {
    MarsRoverPhotosTheme {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = { BottomNavigationBar(navController) }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("home") { HomeScreen() }
                composable("explore") { ExploreScreen(navController) }
                composable("saved") {
                    val savedViewModel: SavedViewModel = hiltViewModel()
                    SavedScreen(savedViewModel)
                }
                composable("search/{selectedRover}/{selectedSol}") {
                    val selectedRover = it.arguments?.getString("selectedRover") ?: "curiosity"
                    val selectedSol: Int = it.arguments?.getString("selectedSol")?.toInt() ?: 1
                    val resultsViewModel: ResultsViewModel = hiltViewModel()

                    ResultsScreen(
                        selectedRover = selectedRover,
                        selectedSol = selectedSol,
                        viewModel = resultsViewModel
                    )
                }
            }
        }
    }
}
