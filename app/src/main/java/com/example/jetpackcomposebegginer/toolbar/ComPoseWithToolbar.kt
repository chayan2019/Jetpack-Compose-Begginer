package com.example.jetpackcomposebegginer.toolbar

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebegginer.ui.theme.JetpackComposebegginerTheme

class ComPoseWithToolbar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposebegginerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    createBarButton()
                    ToolBarSample()
                }
            }
        }
    }
}

@Composable
fun createBarButton() {
    val activity = (LocalContext.current as? Activity)
    // Creating a normal button at a margin of 100dp from the top
    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 100.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { activity?.finish() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
        ) {
            Text("Back to Prev Screen", color = Color.White)
        }
    }
}

@Composable
fun ToolBarSample() {
    val activity = (LocalContext.current as? Activity)

    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Android Toolbar Bar")
            },
            backgroundColor = MaterialTheme.colors.primarySurface,
            navigationIcon = {
                IconButton(onClick = {
                    activity?.finish()
                }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Share, null)
                }
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Settings, null)
                }
            })
    }
}
