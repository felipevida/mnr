package app.mnr.network

import android.util.Log
import app.mnr.data.PhotosResponse
import javax.inject.Inject

class PhotoRepository @Inject constructor(
    private val photoService: MNRPhotoService
) {
    suspend fun getMarsPhotos(rover: String, sol: Int, page: Int): MNRResult<PhotosResponse> {
        val response = photoService.getMarsPhotos(rover, sol, page, "DEMO_KEY")
        return if (response.isSuccessful) {
            MNRResult.Success(response.body()!!)
        } else {
            MNRResult.Error("Error: ${response.errorBody()?.string()}")
        }
    }
}