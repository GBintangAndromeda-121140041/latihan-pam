package com.androiddevs.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ScreenC(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pecel Lele", fontSize = 64.sp )
        Image(
            painter = painterResource(R.drawable.pecel_lele),
            contentDescription = null
        )
        Spacer(
            modifier = Modifier
                .height(65.dp)
        )
        Button(
            onClick = { navController.navigate("Home") }
        ) {
            Text(text = "Back to Home", fontSize = 40.sp)
        }
    }
}