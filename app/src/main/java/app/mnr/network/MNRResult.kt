package app.mnr.network

sealed class MNRResult<out T> {
    data class Success<T>(val data: T) : MNRResult<T>()
    data class Error(val message: String) : MNRResult<Nothing>()
}
