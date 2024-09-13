package app.mnr.ui.saved

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.mnr.R
import app.mnr.data.PhotoEntity
import app.mnr.view.saved.SavedViewModel
import coil.compose.AsyncImage

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SavedScreen(viewModel: SavedViewModel) {

//    // Observe the MutableState for saved photos
//    val savedPhotos by viewModel.savedPhotos
//
//    // Fetch saved photos when the screen is first launched
//    LaunchedEffect(Unit) {
//        viewModel.getSavedPhotos()
//    }
//
//    Scaffold {
//        if (savedPhotos.isNotEmpty()) {
//            SavedPhotosList(savedPhotos, viewModel)
//        } else {
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                Text("No saved photos", fontSize = 18.sp)
//            }
//        }
//    }
//}
//
//@Composable
//fun SavedPhotosList(savedPhotos: List<PhotoEntity>, viewModel: SavedViewModel) {
//    LazyColumn(
//        contentPadding = PaddingValues(16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(savedPhotos) { photo ->
//            SavedPhotoCard(photo = photo, viewModel = viewModel)
//        }
//    }
//}
//
//@Composable
//fun SavedPhotoCard(photo: PhotoEntity, viewModel: SavedViewModel) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        elevation = 8.dp
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        ) {
//            AsyncImage(
//                model = photo.imgSrc,
//                contentDescription = photo.imgSrc,
//                modifier = Modifier
//                    .fillMaxWidth()
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            // Display photo details (ID, Sol, Rover Name)
//            Text("ID: ${photo.id}", fontSize = 16.sp)
//            Text("SOL: ${photo.sol}", fontSize = 16.sp)
//            Text(photo.roverName, fontSize = 16.sp)
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.End
//            ) {
//                // Delete button
//                IconButton(onClick = { viewModel.deletePhoto(photo) }) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_trash_delete_button),
//                        contentDescription = "Delete Photo",
//                        tint = Color.Red
//                    )
//                }
//            }
//        }
//    }
}
