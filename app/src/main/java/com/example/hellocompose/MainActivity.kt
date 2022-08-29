package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomText(text = "Hello!")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Howdy!")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hi!")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Wassup!")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomText(text = "I'm fine!")
            CustomText(text = "You?")
        }
    }
}

@Composable
fun CustomText(text: String) {
    Text(
        modifier = Modifier
            .background(MaterialTheme.colors.secondary)
            .padding(10.dp),
        //.fillMaxWidth(),
        text = text,
        color = MaterialTheme.colors.primary,
        fontSize = 25.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}