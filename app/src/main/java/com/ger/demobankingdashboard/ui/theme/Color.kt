package com.ger.demobankingdashboard.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val DarkBlue30 = Color(0xFF0D1930)
val DarkBlue22 = Color(0xFF071222)
val DarkBlue11 = Color(0xFF030811)


val gradientBrushBG = Brush.verticalGradient(colors = listOf(DarkBlue30, DarkBlue22, DarkBlue11))


val BeigeBC = Color(0xFFD7C9BC)
val Beige46 = Color(0xFF735546)

val gradientBeigeBrush = Brush.verticalGradient(colors = listOf(BeigeBC, Beige46))

val DarkBlue9C = Color(0xFF244B9C)
val DarkBlue67 = Color(0xFF132D67)
val DarkBlue21 = Color(0xFF050D21)

val BlueCardBG = Brush.linearGradient(colors = listOf(DarkBlue9C, DarkBlue67, DarkBlue21),
   Offset(-100f, -100f),
    Offset(1000f, 1000f))