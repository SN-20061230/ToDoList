package uz.sardor.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.sardor.todolist.screens.AddScreen
import uz.sardor.todolist.screens.MainScreen
import uz.sardor.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }


                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screens.MainScreen.route){
                    composable(route = Screens.MainScreen.route) {
                        MainScreen(navController = navController)
                    }
                    composable(route = Screens.AddScreen.route) {
                        AddScreen(navController = navController)
                    }
                }
            }
        }
    }
}

