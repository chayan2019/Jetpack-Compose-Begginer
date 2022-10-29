package com.example.jetpackcomposebegginer.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebegginer.ui.theme.JetpackComposebegginerTheme

class ComposeWithTextView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposebegginerTheme() {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onSecondary
                ) {
                    showToolBar()
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Welcome to Jetpack Compose",
                            modifier = Modifier.padding(8.dp),
                            color = Color.Red,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                        Text(
                            text = "Welcome to Jetpack Compose111",
                            modifier = Modifier.padding(8.dp),
                            color = Color.Blue,
                            fontSize = 20.sp

                        )
                        Text(
                            text = "Welcome to Jetpack Compose222",
                            modifier = Modifier.padding(8.dp),
                            color = Color.Cyan,
                            fontSize = 20.sp

                        )
                    }
                }
            }
        }
    }

    @Composable
    fun showToolBar() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Second  Page", color = Color.White) },
                    backgroundColor = Color(0xff0f9d58)
                )
            },
            content = {}
        )
    }
}