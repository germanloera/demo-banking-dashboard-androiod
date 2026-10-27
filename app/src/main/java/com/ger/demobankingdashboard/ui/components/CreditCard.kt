package com.ger.demobankingdashboard.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.ger.demobankingdashboard.R
import com.ger.demobankingdashboard.ui.theme.BlueCardBG


@Preview
@Composable
fun CreditCard() {

    Card(
        modifier = Modifier
            .background(BlueCardBG, shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .aspectRatio(1.586f)
            .clip(RoundedCornerShape(16.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {


        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()

        ) {
            val (cardDesign1Ref, cardDesign2Ref, chip, cardRay, cardLogo) = createRefs()
            val (bankName, cardNumber, cardHolder, cardHolderName, accountType) = createRefs()
            val startMargin = 31.dp

            Image(
                painter = painterResource(R.drawable.card_design_2),
                contentDescription = null,
                modifier = Modifier
                    .width(220.dp)
                    .aspectRatio(1f)
                    .constrainAs(cardDesign2Ref) {
                        top.linkTo(parent.top, margin = (-16).dp)
                        end.linkTo(parent.end)

                    }
            )
            Image(
                painter = painterResource(R.drawable.card_design_1),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .aspectRatio(1f)
                    .constrainAs(cardDesign1Ref) {
                        bottom.linkTo(parent.bottom)
                        end.linkTo(parent.end)

                    }
            )
            Image(
                painter = painterResource(R.drawable.card_chip),
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .aspectRatio(1f)
                    .constrainAs(chip) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start, startMargin)

                    }
            )
            Image(
                painter = painterResource(R.drawable.ray),
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .aspectRatio(1f)
                    .constrainAs(cardRay) {
                        top.linkTo(parent.top, 40.dp)
                        end.linkTo(parent.end, 40.dp)

                    }
            )
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .width(35.dp)
                    .aspectRatio(1f)
                    .constrainAs(cardLogo) {

                        bottom.linkTo(parent.bottom, 10.dp)
                        end.linkTo(parent.end, 50.dp)

                    }
            )
            Text(
                text = "NORTHSTAR",
                style = TextStyle(
                    fontSize = 10.sp,
                    lineHeight = 15.sp,
                    //fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 1.6.sp,
                ),
                modifier = Modifier.constrainAs(bankName) {
                    top.linkTo(parent.top, 40.dp)
                    start.linkTo(parent.start, startMargin)

                }
            )
            Text(
                text = "•••• •••• •••• 7712",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 25.5.sp,
                    //fontFamily = FontFamily(Font(R.font.dm_mono)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 2.2.sp,
                ),
                modifier = Modifier.constrainAs(cardNumber) {
                    bottom.linkTo(cardHolder.top, 10.dp)
                    start.linkTo(parent.start, startMargin)
                }
            )
            Text(
                text = "CARDHOLDER",
                style = TextStyle(
                    fontSize = 6.sp,
                    lineHeight = 9.sp,
                    // fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 1.sp,
                ),
                modifier = Modifier.constrainAs(cardHolder) {
                    bottom.linkTo(cardHolderName.top, )
                    start.linkTo(parent.start, startMargin)
                }
            )
            Text(
                text = "ALEX MORGAN",
                style = TextStyle(
                    fontSize = 9.sp,
                    lineHeight = 13.5.sp,
                    //fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.7.sp,
                ),
                modifier = Modifier.constrainAs(cardHolderName) {
                    bottom.linkTo(parent.bottom, 21.dp)
                    start.linkTo(parent.start, startMargin)
                }
            )
            Text(
                text = "TRAVEL SIGNATURE",
                style = TextStyle(
                    fontSize = 6.sp,
                    lineHeight = 9.sp,
                    //fontFamily = FontFamily(Font(R.font.manrope)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 1.sp,
                ),
                modifier = Modifier.constrainAs(accountType) {
                    bottom.linkTo(cardLogo.top, 0.dp)
                    end.linkTo(cardLogo.end)
                    start.linkTo(cardLogo.start)
                }
            )


        }


    }


}