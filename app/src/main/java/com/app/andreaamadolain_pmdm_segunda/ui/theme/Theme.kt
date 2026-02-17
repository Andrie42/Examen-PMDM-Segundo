package com.app.andreaamadolain_pmdm_segunda.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1565C0),
    onPrimary = Color.White,

    secondary = Color(0xFF1976D2),
    onSecondary = Color.White,

    tertiary = Color(0xFF42A5F5),

    background = Color(0xFFF5F9FF),
    surface = Color.White,

    onBackground = Color(0xFF0D1B2A),
    onSurface = Color(0xFF0D1B2A)
)

// Modo oscuro
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF90CAF9),
    onPrimary = Color(0xFF0D1B2A),

    secondary = Color(0xFF64B5F6),
    onSecondary = Color(0xFF0D1B2A),

    tertiary = Color(0xFF42A5F5),

    background = Color(0xFF0D1B2A),
    surface = Color(0xFF1B263B),

    onBackground = Color(0xFFE3F2FD),
    onSurface = Color(0xFFE3F2FD)
)

@Composable
fun AndreaAmadoLain_PMDM_SegundaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        com.app.andreaamadolain_pmdm_segunda.ui.theme.LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
