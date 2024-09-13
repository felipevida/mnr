package app.mnr.view.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.mnr.R
import coil.compose.AsyncImage

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())
    ) {

        // Powered by
        Text(
            text = stringResource(id = R.string.powered_by),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 20.dp, top= 20.dp, end = 20.dp)
        )

        // NASA APIs image
        AsyncImage(
            model = R.drawable.nasa_apis,
            contentDescription = "NASA APIs",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            contentScale = ContentScale.FillWidth,
        )

        // TITLE
        Text(
            text = stringResource(id = R.string.home_screen_title),
            fontSize = 22.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
        )

        // TEXT
        Text(
            text = stringResource(id = R.string.home_screen_text),
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
        )
    }
}
