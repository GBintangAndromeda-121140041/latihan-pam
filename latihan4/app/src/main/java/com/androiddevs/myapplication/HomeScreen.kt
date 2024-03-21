package com.androiddevs.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        Text(text = "Anda mau berbuka dengan makanan apa ?")
        Spacer(modifier = Modifier)
        Button(
            onClick = { navController.navigate("A") }
        ) {
            Text(text = "Ayam Bakar")
        }

        Button(
            onClick = { navController.navigate("B") }
        ) {
            Text(text = "Sate Kambing")
        }

        Spacer(modifier = Modifier)


        Button(
            onClick = { navController.navigate("C") }
        ) {
            Text(text = "Pecel Lele")
        }


    }
}


