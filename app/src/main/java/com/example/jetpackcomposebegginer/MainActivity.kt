package com.example.jetpackcomposebegginer
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebegginer.text.ComposeWithTextView
import com.example.jetpackcomposebegginer.ui.theme.JetpackComposebegginerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposebegginerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NextScreen()
                        // Fetching the Local Context
                        val mContext = LocalContext.current

                        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                            // implements an Intent to go to SecondActivity
                            Button(onClick = {
                                mContext.startActivity(Intent(mContext, ComposeWithTextView::class.java))
                            },
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
                            ) {
                                Text("Go to Second Activity", color = Color.White)
                            }
                        }
                }
            }
        }
    }

    @Composable
    fun NextScreen() {
        Scaffold(
            topBar = { TopAppBar(title = { Text("First Page", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },
            content = {}
        )
    }
}