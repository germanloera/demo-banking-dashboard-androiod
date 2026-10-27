package com.ger.demobankingdashboard.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBarState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ger.demobankingdashboard.R
import com.ger.demobankingdashboard.ui.components.CreditCard
import com.ger.demobankingdashboard.ui.components.TopBAr


import com.ger.demobankingdashboard.ui.theme.DemoBankingDashboardTheme
import com.ger.demobankingdashboard.ui.theme.gradientBrushBG

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DashboardScreen() {

    DemoBankingDashboardTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { TopBAr() },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
                )
            },
            containerColor = Color.Transparent,
            modifier = Modifier
                .fillMaxSize()
                .background(gradientBrushBG),
        ) { innerPadding ->
            Box(Modifier.fillMaxWidth()) {

                Image(
                    painter = painterResource(R.drawable.main_screen_gb),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(bottom = 160.dp)
                )




                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp)
                        .padding(innerPadding)
                        .padding(top = 25.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {

                    CreditCard()


                    // Child views.
                }
            }
        }
    }

}