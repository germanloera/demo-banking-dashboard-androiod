package com.ger.demobankingdashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.ger.demobankingdashboard.ui.screens.DashboardScreen
import com.ger.demobankingdashboard.ui.theme.DarkBlue11
import com.ger.demobankingdashboard.ui.theme.DarkBlue30


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(DarkBlue30.toArgb(),),
            navigationBarStyle = SystemBarStyle.dark( DarkBlue11.toArgb())
        )
        setContent {
            DashboardScreen()
        }
    }
}


