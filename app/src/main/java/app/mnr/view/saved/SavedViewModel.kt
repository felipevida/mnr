package app.mnr.view.saved

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import app.mnr.data.Photo
import app.mnr.data.PhotoEntity

class SavedViewModel : ViewModel() {

    /**
     * MutableState to integrate with Jetpack Compose
     */
    val savedPhotos: MutableState<List<PhotoEntity>> = mutableStateOf(emptyList())

    /**
     * Fetch saved photos from Realm
     */
    fun getSavedPhotos() {
//        viewModelScope.launch {
//            withContext(Dispatchers.IO) {
//                Realm.getDefaultInstance().use { realm ->
//                    realm.executeTransaction {
//                        val photos = it.where(PhotoEntity::class.java)
//                            .findAll()
//                        savedPhotos.value = it.copyFromRealm(photos)
//                    }
//                }
//            }
//        }
    }

    /**
     * Delete a photo from Realm
     */
    fun deletePhoto(photo: Photo) {
//        viewModelScope.launch {
//            withContext(Dispatchers.IO) {
//                Realm.getDefaultInstance().use { realm ->
//                    realm.executeTransaction {
//                        val photoToDelete = it.where(PhotoEntity::class.java)
//                            .equalTo("id", photo.id)
//                            .findFirst()
//                        photoToDelete?.deleteFromRealm()
//                        getSavedPhotos()
//                    }
//                }
//            }
//        }
    }

    /**
     * Ensure Realm resources are cleaned up properly
     */
    override fun onCleared() {
//        super.onCleared()
//        Realm.getDefaultInstance().close()
    }
}
