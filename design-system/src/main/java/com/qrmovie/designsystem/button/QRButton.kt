package com.qrmovie.designsystem.button

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.qrmovie.designsystem.token.TokenIconRef
import com.qrmovie.designsystem.ui.theme.DSColorToken
import com.qrmovie.designsystem.ui.theme.DSDimenToken

val defaultModifier = Modifier
    .padding(horizontal = DSDimenToken.dimen16dp)
    .fillMaxWidth()

@Composable
fun QRButton(
    type: QRButtonEnum = QRButtonEnum.PRIMARY,
    title: String,
    showIcon: Boolean = false,
    buttonClick: () -> Unit,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
) {
    when (type) {
        QRButtonEnum.PRIMARY -> {
            OutlinedButton(
                onClick = { buttonClick.invoke() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = DSColorToken.PrimaryMain
                ),
                shape = RoundedCornerShape(DSDimenToken.dimen8dp),
                modifier = defaultModifier.then(modifier)
            ) {
                if (showIcon) {
                    Icon(
                        painter = TokenIconRef.getIcon(iconType = TokenIconRef.IconType.Search),
                        contentDescription = "",
                        modifier = Modifier.padding(
                            start = DSDimenToken.dimen16dp,
                            end = DSDimenToken.dimen8dp
                        )
                    )
                }

                Text(
                    text = title, color = DSColorToken.TextOnPrimary, modifier = Modifier
                        .padding(end = DSDimenToken.dimen24dp)
                )
            }
        }

        QRButtonEnum.SECONDARY -> {
            OutlinedButton(
                onClick = { buttonClick.invoke() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = DSColorToken.Transparent
                ),
                border = BorderStroke(DSDimenToken.dimen2dp, DSColorToken.BorderMain),
                shape = RoundedCornerShape(DSDimenToken.dimen8dp),
                modifier = defaultModifier.then(modifier)
            ) {

                if (showIcon) {
                    Icon(
                        painter = TokenIconRef.getIcon(iconType = TokenIconRef.IconType.Search),
                        contentDescription = "",
                        modifier = Modifier.padding(
                            start = DSDimenToken.dimen16dp,
                            end = DSDimenToken.dimen8dp
                        )
                    )
                }
                Text(
                    text = title, color = DSColorToken.TextOnPrimary, modifier = Modifier
                        .alignByBaseline()
                        .padding(end = DSDimenToken.dimen24dp)
                )
            }
        }

        QRButtonEnum.TERTIARY -> {
            OutlinedButton(
                onClick = { buttonClick.invoke() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(DSDimenToken.dimen2dp, Color.Transparent),
                shape = RoundedCornerShape(DSDimenToken.dimen8dp),
                modifier = defaultModifier
                    .then(modifier)

            ) {

                if (showIcon) {
                    Icon(
                        painter = TokenIconRef.getIcon(iconType = TokenIconRef.IconType.Search),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = DSDimenToken.dimen16dp, end = DSDimenToken.dimen8dp)
                    )
                }
                Text(
                    text = title,
                    color = DSColorToken.TextOnPrimary,
                    modifier = Modifier
                        .padding(end = DSDimenToken.dimen24dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF1A2232)
@Composable
private fun QRButtonPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(DSDimenToken.dimen16dp)) {
        QRButton(QRButtonEnum.PRIMARY, showIcon = true, title = "Primary Button", buttonClick = {})
        QRButton(QRButtonEnum.PRIMARY, showIcon = false, title = "Primary Button", buttonClick = {})
        QRButton(
            QRButtonEnum.SECONDARY,
            showIcon = true,
            title = "Secondary Button",
            buttonClick = {})
        QRButton(
            QRButtonEnum.SECONDARY,
            showIcon = false,
            title = "Secondary Button",
            buttonClick = {})
        QRButton(
            QRButtonEnum.TERTIARY,
            showIcon = true,
            title = "Tertiary Button",
            buttonClick = {})
        QRButton(
            QRButtonEnum.TERTIARY,
            showIcon = false,
            title = "Tertiary Button",
            buttonClick = {})

    }
}