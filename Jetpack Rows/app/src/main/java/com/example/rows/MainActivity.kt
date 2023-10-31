package com.example.rows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.rows.ui.theme.RowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize(0.5f) // to fill 50% of total
                    // alternate of fillMaxSize() is to use width() and height()
                    .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
//verticalArrangement = Arrangement.SpaceBetween to set all text at extremes or at equal distance.
//verticalArrangement = Arrangement.CenterVertically to set all text vertically at equal distance.
            ) {
                Text(text = "How World")
                Text(text = "Garvit Joshi")
                Text(text = "How are you?")
            }


//           3. Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Text(text = "Garvit Joshi")
//                Text(text = "Hello World!")
//            }

            // To place text one down another in diff. lines
//           1.  Column {
//                Text(text = "Garvit Joshi")
//                Text(text = "Hello World!")
//            }

            // To place text one next to another use rows
//          2.   Row{
//                Text(text = "Hi")
//                Text(text = " How are you")
//            }
        }
    }
}
