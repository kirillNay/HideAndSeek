package nay.kirill.core.compose

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object AppTextStyle {

    val Header = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.W700,
        fontFamily = FontFamily.SansSerif,
        lineHeight = 30.sp,
        color = AppColors.BlackText
    )

    val SubTitle = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.W300,
        fontFamily = FontFamily.SansSerif,
        lineHeight = 26.sp,
        color = AppColors.GreyText
    )

    val ButtonStyle = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        color = AppColors.OnPrimary
    )

}