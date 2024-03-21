package com.androiddevs.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Home"
    ) {
        composable(route = "Home") {
            HomeScreen(navController)
        }
        composable(route = "A") {
            ScreenA(navController)
        }
        composable(route = "B") {
            ScreenB(navController)
        }
        composable(route = "C") {
            ScreenC(navController)
        }


    }


}

