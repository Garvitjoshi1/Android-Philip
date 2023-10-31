package com.example.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiers.ui.theme.ModifiersTheme
import org.w3c.dom.Text
import java.lang.reflect.Modifier
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = androidx.compose.ui.Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(600.dp)
                    .padding(top = 50.dp) //shift by no. of dp from required reference
                // padding is kind of margin in jetpack
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)

//                    .requiredWidth(300.dp)

            ) {
                Text(text = "How are you?", modifier = androidx.compose.ui.Modifier
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .offset(50.dp, 20.dp) // offset(x_coordinate, y_coordinate) used to shift text.
                    .border(10.dp, Color.Yellow)
                    .padding(10.dp)
                    // make our text clickable {}, or draggable etc.
//                    .clickable {
//
//                    }
                )

                //spacer is to provide space. b/w 2 or more texts
                Spacer(modifier = androidx.compose.ui.Modifier.height(50.dp))
                Text(text = "I am fine")
            }
        }
    }
}
