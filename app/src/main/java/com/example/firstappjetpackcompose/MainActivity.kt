package com.example.firstappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val text = "Привет"

        val myModifier = Modifier
            .padding(top = 800.dp, start = 150.dp)
            .border(width = 2.dp, Color.Red)
            .padding(10.dp)
            .border(width = 2.dp, Color.Red)
            .background(color = Color.Yellow)
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)

        val mySecondModifier = Modifier
            .padding(start = 80.dp, top = 40.dp)
            .size(260.dp)
            .clip(CircleShape)
            .background(color = Color.Cyan)
            .border(width = 2.dp, Color.Green, shape = CircleShape)
            .padding(start = 90.dp, top = 110.dp)


        setContent {
            //Greeting(text = text, modifier = myModifier)
            Message(text = text, modifier = mySecondModifier)
        }
    }

}
@Composable
fun Greeting(
    text: String,
    modifier: Modifier = Modifier
        .padding(top = 800.dp, start = 150.dp)
        .border(width = 2.dp, Color.Red)
        .padding(10.dp)

) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = modifier
    )

}

@Composable
fun Message(
    text: String,
    modifier: Modifier = Modifier
        .padding(top = 30.dp, start = 160.dp)

){
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = modifier
    )
}
