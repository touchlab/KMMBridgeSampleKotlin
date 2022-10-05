package co.touchlab.kmmbridgesamplekotlin

import Shared
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.touchlab.kmmbridgesamplekotlin.ui.theme.KMMBridgeSampleKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KMMBridgeSampleKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val text = Shared().getString()
                    Greeting(text)
                }
            }
        }
    }
}

@Composable
fun Greeting(text: String) {
    Text(text)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KMMBridgeSampleKotlinTheme {
        Greeting("Test")
    }
}