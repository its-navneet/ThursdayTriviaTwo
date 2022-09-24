package com.example.android.thursdaytriviadaytwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.thursdaytriviadaytwo.ui.theme.ThursdayTriviaDayTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTriviaDayTwoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp() {
    Column(modifier = Modifier){
        Image(painter = painterResource(id = R.drawable.banner) , contentDescription = "Banner")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Score", modifier = Modifier.align(alignment = Alignment.CenterHorizontally), fontSize = 30.sp)
        Text(text = "0 / 4", modifier = Modifier.align(alignment = Alignment.CenterHorizontally), fontSize = 50.sp)
        Spacer(modifier = Modifier.height(120.dp))
        UserRow()
        Spacer(modifier = Modifier.height(100.dp))
        ButtonRow()
        Spacer(modifier = Modifier.height(60.dp))
        Text(text = "#JetpackCompose", fontSize = 20.sp, fontStyle = FontStyle(R.font.sans_serif), modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
    }
}

@Composable
fun UserRow(){
    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth(),) {
        Column() {
            Text(text = "You Chose", fontSize = 16.sp)
            Text(text = "Rock", fontSize = 32.sp)
        }
        Column() {
            Text(text = "Android chose", fontSize = 16.sp)
            Text(text = "Paper", fontSize = 32.sp)
        }
    }
}

@Composable
fun ButtonRow(){
    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
        Button(onClick = { /*TODO*/ }, modifier = Modifier.size(100.dp), shape = RoundedCornerShape(10.dp)) {
            Text(text = "Rock")
        }
        Button(onClick = { /*TODO*/ },  modifier = Modifier.size(100.dp), shape = RoundedCornerShape(10.dp) ) {
            Text(text = "Paper")
        }
        Button(onClick = { /*TODO*/ },  modifier = Modifier.size(100.dp), shape = RoundedCornerShape(10.dp)) {
            Text(text = "Scissors")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThursdayTriviaDayTwoTheme {
        MainApp()
    }
}