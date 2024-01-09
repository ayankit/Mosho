package com.devay.mosho.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.devay.mosho.R

private val Kodchasan = FontFamily(
        Font(R.font.kodchasan_light, FontWeight.Light),
        Font(R.font.kodchasan_medium, FontWeight.Medium),
        Font(R.font.kodchasan_regular, FontWeight.Normal),
        Font(R.font.kodchasan_semibold, FontWeight.SemiBold),
        Font(R.font.kodchasan_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
        displayLarge = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
        ),
        displayMedium = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
        ),
        displaySmall = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
        ),
        titleLarge = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
        ),
        titleMedium = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
        ),
        titleSmall = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
        ),
        headlineLarge = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
        ),
        headlineMedium = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
        ),
        headlineSmall = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
        ),
        bodyLarge = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp
        ),
        bodyMedium = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
        ),
        bodySmall = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
        ),
        labelLarge = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp
        ),
        labelMedium = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
        ),
        labelSmall = TextStyle(
                fontFamily = Kodchasan,
                fontWeight = FontWeight.Light,
                fontSize = 11.sp
        )
)