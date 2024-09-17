package com.qrmovie.designsystem.icon

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.qrmovie.designsystem.token.TokenIconRef

@Composable
fun QRIcon(image: Painter) {
    Icon(painter = image, contentDescription = "$image")
}

@Preview
@Composable
private fun QRIconPreview() {
    QRIcon(TokenIconRef.getIcon(iconType = TokenIconRef.IconType.Add))
}