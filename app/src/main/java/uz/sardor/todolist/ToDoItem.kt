package uz.sardor.todolist

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun ToDoItem(navController: NavController){

    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .height(50.dp)
        .clickable {
            navController.navigate(route = Screens.AddScreen.route)
        }
        .border(
            BorderStroke(1.dp, Color.LightGray),
            shape = RoundedCornerShape(12.dp),

            ),

        colors = CardDefaults.cardColors(
            containerColor = Color.White),
    ){

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .fillMaxHeight(), horizontalArrangement = Arrangement.SpaceBetween){


                Text(textAlign = TextAlign.Center,text = "name", fontSize = 15.sp, fontWeight = FontWeight.SemiBold,  )



            Row {
                Image(painter = painterResource(id = R.drawable.done), contentDescription = null)
                Spacer(modifier = Modifier.width(10.dp))

                Image(painter = painterResource(id = R.drawable.cancel), contentDescription = null)

            }

        }

    }


}