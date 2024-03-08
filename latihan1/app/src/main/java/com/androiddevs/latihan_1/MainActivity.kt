package com.androiddevs.latihan_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.androiddevs.latihan_1.ui.theme.Latihan1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterLayout()
                }
            }
        }
    }
}

@Composable
fun CounterLayout() {
    var counter by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text =  stringResource(R.string.test, counter),
            style = MaterialTheme.typography.displaySmall
            )
        Button(onClick = { counter += 1 }) {
            Text(text = stringResource(R.string.plus))
        }
        Button(onClick = { counter -= 1 }) {
            Text(text = stringResource(R.string.minus))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Latihan1Preview() {
    Latihan1Theme {
        CounterLayout()
    }
}