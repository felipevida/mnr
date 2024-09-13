package app.mnr.view.explore.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.mnr.data.Photo
import app.mnr.data.PhotosResponse
import app.mnr.network.MNRResult
import app.mnr.network.PhotoRepository
import app.mnr.view.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResultsViewModel @Inject constructor(
    private val repository: PhotoRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<PhotosResponse>>(UiState.Loading)
    val uiState: StateFlow<UiState<PhotosResponse>> get() = _uiState

    fun fetchMarsPhotos(rover: String, sol: Int, page: Int) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            val result = repository.getMarsPhotos(rover, sol, page) // Repository now returns Result
            _uiState.value = when (result) {
                is MNRResult.Success -> UiState.Success(result.data)
                is MNRResult.Error -> UiState.Error(result.message)
            }
        }
    }

    fun savePhoto(photo: Photo) {
        // TODO: Add item to local database (missing implementation).
    }

    fun deletePhoto(id: Int) {
        // TODO: Delete item from local database (missing implementation).
    }
}
