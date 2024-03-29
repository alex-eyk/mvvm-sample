package com.alex.eyk.imbridge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alex.eyk.imbridge.ui.theme.ImbridgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImbridgeTheme {
               ImApp()
            }
        }
    }
}

@Composable
private fun ImApp() {
    NavHost(
        navController = rememberNavController(),
        startDestination = "sign_in"
    ) {
        composable("sign_in") {
            SignInScreen()
        }
    }
}
