package com.example.cmposelesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(  modifier = Modifier
                .background(Color.Blue).fillMaxHeight(0.5f).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            Alignment.CenterVertically) {

                Column(modifier = Modifier
                    .background(Color.Red),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Hello world!")
                    Text(text = "Hello Tomsk!")
                    Text(text = "Hello!!!!!!!!")
                }
                Column(modifier = Modifier
                    .background(Color.Green).fillMaxHeight(0.5f),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.Start

                ) {
                    Text(text = "Hello world!")
                    Text(text = "Hello Tomsk!")
                    Text(text = "Hello!!!!!!!!")
                }
            }



        }
    }
}
