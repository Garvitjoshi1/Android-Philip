package com.example.tutorial
// if any file has v24 or any v(number) written to it means its limited to that api version
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tutorial.ui.theme.TutorialTheme

/* class MyClass(private val context: Context){
 --> If activity or file context is created is destroyed, context also destroys
}
*/

/* TODO - Qualifiers
In Android, qualifiers are used to specify the characteristics of a device or configuration
that a particular set of resources is targeting 1. Qualifiers are used to create resource directory
 */

class MainActivity : ComponentActivity() {

    // private val viewModel = ContactsViewModel() , this line will not change color when
    // screen rotate as it loose connection and new Activity is being build
    private val viewModel by viewModels<ContactsViewModel>() //model prevent screen rotation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO - RESOURCES : Resources are used to show images, string means to show diff. language in app

        //TODO-Context
        /// val myContext: Context = this //points towards the context
        /* Context:
     1. context is an interface that contains global information about an application's environment
     2. Context can be used to:
        2.1 Get information about the activity and application
        2.2 Get access to resources, databases, and shared preferences
        2.3 Let newly-created objects understand what has been going on
        */

        // Part of activity life-cycle
//        println("onCreate()")

        val color = getColor(R.color.purple_200)
        setContent {
            TutorialTheme {
                val color = colorResource(id = R.color.purple_200)
                // adding resources
                Image(
                    painter = painterResource(id = R.drawable.shiv),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )

                // implementation("androidx.lifecycle:lifecycle-view-model-compose:2.6.2")
                // added this line to dependencies on Gradle Script in Module :app
//                val viewModel = viewModel<ContactsViewModel>(
//                    factory = object : ViewModelProvider.Factory {
//                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                            return super.create(modelClass)
//                        }
//                    }
//                )

                // CTRL+P inside viewModel<ContactsViewModel>() parenthesis to import factory
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    // view-model assigned backgroundColor to change
//                    color = viewModel.backgroundColor
//                ) {
//                    // function assigned to button
//                    Button(onClick = {
//                        viewModel.changeBackgroundColor()
//                    }) {
//                        // text assigned to button
//                        Text(text = "Change Color")
            }
        }
    }
}

    // activities Lifecycle function to tell which activities work till Restart
//    override fun onStart(){
//        super.onStart()
//        println("onStart()")
//    }
//
//    override fun onResume(){
//        super.onResume()
//        println("onResume()")
//    }
//
//    override fun onPause(){
//        super.onPause()
//        println("onPause()")
//    }
//
//    override fun onStop(){
//        super.onStop()
//        println("onStop()")
//    }
//
//    override fun onDestroy(){
//        super.onDestroy()
//        println("onDestroy()")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        println("onRestart()")
//    }
//
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TutorialTheme {
//        Greeting("Android")
//    }
//}
