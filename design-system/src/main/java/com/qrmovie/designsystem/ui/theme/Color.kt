package com.qrmovie.designsystem.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

internal object DSColorToken {

    val PrimaryMain = Color(0xFFFF8036)
    val SecondaryMain = Color(0xFFFC6D19)
    val PrimaryLinearGradient = Brush.linearGradient(
        colors = listOf(PrimaryMain, SecondaryMain),
        start = Offset(0f, 0f),
        end = Offset(1000f, 1000f)
    )

    val SurfaceMain = Color(0xFF1A2232)
    val SurfaceGlass = Color(0xB31F293D)
    val SurfaceFade = Brush.linearGradient(
        colors = listOf(Color(0xff1F293D), Color(0xFF1F293D)),
        start = Offset(0f, 0f),
        end = Offset(1000f, 1000f)
    )
    val SurfaceDeep = Color(0xFF253554)
    val SurfaceMainPressed = Color(0xFF202B40)

    val White = Color(0xFFFFFFFF)
    val TextOnPrimary = Color(0xFFFFFFFF)
    val TextMuted = Color(0xFF637394)

    val BorderMain = Color(0x1A6D9EFF)

    val IconMain = Color(0xFF637394)

    val SemanticPositive = Color(0xFF14CC52)
    val SemanticWarning = Color(0xFFE5A117)

    val Transparent = Color(0x00000000)
}