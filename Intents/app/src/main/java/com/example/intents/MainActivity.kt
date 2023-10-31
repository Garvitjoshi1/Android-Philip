package com.example.intents

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intents.ui.theme.IntentsTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ImageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            IntentsTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                }
                Button(onClick = {
// to launch secondActivity on new page
//                        Intent(applicationContext, SecondActivity::class.java).also {
//                            startActivity(it)
//                        }

                        //ACTION_MAIN for general use like youtube
//                        Intent(Intent.ACTION_MAIN).also {
//                            //enter youtube package name
//                            it.`package` = "com.google.android.youtube"
//                            // check error
//                            try {
//                                startActivity(it)
//                            }
//                            catch (e: ActivityNotFoundException){
//                                e.printStackTrace()
//                            }
//                        }

                        //ACTION_SEND is used for email
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_EMAIL, arrayOf("test@test.com"))
                            putExtra(Intent.EXTRA_SUBJECT, "This is my Subject")
                            putExtra(Intent.EXTRA_TEXT, "This is the content of my email")
                        }
                        if (intent.resolveActivity(packageManager) != null){
                            startActivity(intent)
                        }

                    }

                    )
                    {
                        //text for button to show upon it.
                        Text(text = "Click me")
                    }
                }
            }
        }

        @RequiresApi(Build.VERSION_CODES.TIRAMISU)
        override fun onNewIntent(intent: Intent?) {
            super.onNewIntent(intent)
            val uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                intent?.getParcelableExtra(Intent.EXTRA_STREAM, Uri::class.java)
            } else {
                TODO("VERSION.SDK_INT < TIRAMISU")
            }
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
    IntentsTheme {
        Greeting("Android")
    }
}