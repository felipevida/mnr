package app.mnr.network

import app.mnr.data.PhotosResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MNRPhotoService {

    @GET("mars-photos/api/v1/rovers/{rover}/photos")
    suspend fun getMarsPhotos(
        @Path("rover") rover: String,
        @Query("sol") sol: Int,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String
    ): Response<PhotosResponse>
}