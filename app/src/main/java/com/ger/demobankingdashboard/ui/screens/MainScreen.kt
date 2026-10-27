package com.ger.demobankingdashboard.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ger.demobankingdashboard.ui.components.TopBAr


import com.ger.demobankingdashboard.ui.theme.DemoBankingDashboardTheme
import com.ger.demobankingdashboard.ui.theme.gradientBrushBG

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DashboardScreen() {

    DemoBankingDashboardTheme {
        Scaffold(
            topBar = { TopAppBar( title = { TopBAr() }, colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent) ) },
            containerColor = Color.Transparent,
            modifier = Modifier.fillMaxSize().background(gradientBrushBG).padding(horizontal = 20.dp),
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    ,
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {


                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {


                }


                // Child views.
            }
        }
    }

}