package app.mnr.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

// Define your color schemes for dark and light themes
private val DarkColorPalette = darkColors(
    primary = Blue500,
    primaryVariant = Blue700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Blue500,
    primaryVariant = Blue700,
    secondary = Teal200
    // Other default colors like background, surface, etc. can be defined here
)

@Composable
fun MarsRoverPhotosTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Automatically use dark theme based on system settings
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    // Apply MaterialTheme with the chosen colors, typography, and shapes
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
