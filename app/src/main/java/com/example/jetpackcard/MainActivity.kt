package com.example.jetpackcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcard.ui.theme.JetpackCardTheme
import com.example.jetpackcard.ui.theme.MyCustomCard
import com.example.jetpackcard.ui.theme.Publisher

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCardTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    MyCustomCard(
                        modifier = Modifier.fillMaxWidth(0.8f),
                        image = R.drawable.elephant,
                        title = "Shadows & Lightnings",
                        text = "The original version of the song had sold only 52,000 downloads before the version with Christina Aguilera was released, according to Nielsen SoundScan.",
                        publisher = Publisher("Mr. Dog", R.drawable.myimage, "Android Developer")
                    )
                }
            }
        }
    }
}