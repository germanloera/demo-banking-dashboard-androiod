package com.ger.demobankingdashboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ger.demobankingdashboard.ui.theme.gradientBeigeBrush

@Preview
@Composable
fun TopBAr() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {


        Column(
            Modifier,

            verticalArrangement = Arrangement.spacedBy(3.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "Good morning, Germán",
                style = TextStyle(
                    fontSize = 19.sp,
                    lineHeight = 24.7.sp,
                    // fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFFE8F0FF),
                )
            )


            Text(
                text = "Here's your financial overview",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    //fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF8496B5),
                )
            )
        }




        Row(
            horizontalArrangement = Arrangement.spacedBy(11.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(

                modifier = Modifier
                    .shadow(
                        elevation = 18.dp,
                        spotColor = Color(0x77000713),
                        ambientColor = Color(0x77000713)
                    )
                    .border(
                        width = 1.dp,
                        color = Color(0x1B9ABFFF),
                        shape = RoundedCornerShape(size = 18.5.dp)
                    )
                    .width(37.dp)
                    .height(37.dp),
                contentAlignment = Alignment.Center

            ) {
                Text(

                    text = "♧",
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 22.sp,
                        //fontFamily = FontFamily(Font(R.font.manrope)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFE8F0FF),
                        textAlign = TextAlign.Center,
                    )
                )
            }

            Column(
                Modifier

                    .background(gradientBeigeBrush, shape = RoundedCornerShape(size = 50.5.dp))
                    .clip(RoundedCornerShape(size = 50.5.dp))
                    .shadow(
                        elevation = 14.dp,
                        spotColor = Color(0x8802091B),
                        ambientColor = Color(0x8802091B)
                    )
                    .width(37.dp)
                    .height(37.dp),

                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "AM",
                    style = TextStyle(
                        fontSize = 10.sp,
                        lineHeight = 15.sp,
                        // fontFamily = FontFamily(Font(R.font.manrope)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
            }


        }
    }
}