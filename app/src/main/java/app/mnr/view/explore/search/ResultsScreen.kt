package app.mnr.view.explore.search

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.mnr.view.UiState
import app.mnr.view.elements.OnlinePhotoCard

@Composable
fun ResultsScreen(viewModel: ResultsViewModel, selectedRover: String, selectedSol: Int) {

    LaunchedEffect(Unit) {
        viewModel.fetchMarsPhotos(
            selectedRover,
            selectedSol,
            page = 1
        )
    }

    // Observe the uiState from the ViewModel
    val uiState by viewModel.uiState.collectAsState()

    // React to the uiState and update the UI accordingly
    when (uiState) {
        is UiState.Loading -> {
            Text("Loading...", modifier = Modifier.padding(16.dp))
        }

        is UiState.Error -> {
            Text((uiState as UiState.Error).message, modifier = Modifier.padding(16.dp))
        }

        is UiState.Success -> {
            val photos = (uiState as UiState.Success).data.photos
            LazyColumn {
                items(photos) { photo ->
                    OnlinePhotoCard(photo, viewModel)
                }
            }
        }
    }
}
