package app.mnr.view.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.mnr.R
import app.mnr.data.Photo
import app.mnr.view.explore.search.ResultsViewModel
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun OnlinePhotoCard(photo: Photo, viewModel: ResultsViewModel) {

    val painter = rememberAsyncImagePainter(photo.img_src)

    Image(
        painter = painter,
        contentDescription = "example using async image painter",
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
    )


    AsyncImage(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth(),
        model = ImageRequest.Builder(LocalContext.current)
            .data(photo.img_src)
            .setHeader("User-Agent", "Mozilla/5.0")
            .crossfade(true)
            .build(),
        contentScale = ContentScale.FillWidth,
        contentDescription = null
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 8.dp
    ) {


        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    // Display photo details (ID, Sol, Rover Name)
                    Text("ID: ${photo.id}", fontSize = 16.sp)
                    Text("SOL: ${photo.sol}", fontSize = 16.sp)
                    Text(photo.rover.name, fontSize = 16.sp)
                }

                // Card Buttons: Share and Save
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    // Save button
                    IconButton(onClick = { viewModel.savePhoto(photo) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_save_button),
                            contentDescription = "Save Photo",
                            tint = Color.Red
                        )
                    }
                }

            }

        }

    }

}