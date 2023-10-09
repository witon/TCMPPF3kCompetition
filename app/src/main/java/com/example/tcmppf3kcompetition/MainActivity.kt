package com.example.tcmppf3kcompetition

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tcmppf3kcompetition.ui.theme.TCMPPF3kCompetitionTheme
import com.tencent.tmf.mini.api.TmfMiniSDK
import com.tencent.tmf.mini.api.bean.MiniStartLinkOptions
import com.tencent.tmf.mini.api.bean.MiniStartOptions


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TCMPPF3kCompetitionTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
        val options = MiniStartOptions()
        TmfMiniSDK.startMiniApp(this, "tmffaz9a6vrfdr5bzb", options)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TCMPPF3kCompetitionTheme {
        Greeting("Android")
    }
}