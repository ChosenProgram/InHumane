package com.benevolence.inhumane

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun invc() : Color{
    val c = MaterialTheme.colorScheme.inverseSurface
    return c
}

@Composable
fun invc2(diff : String) : Color{
    var c : Color = Color.White
    when(diff){
        "A" -> c = Color.Magenta
        "B" -> c = Color(0xFF0066FF)
        "C" -> c = Color(0xFF5BC04B)
    }
    return c
}

@Composable
fun Nav(){
    Box(Modifier.size(100.dp))
}

@Composable
fun TitleOutskirts(){
    Column (
        Modifier
            .padding(top =150.dp)
    ){
        Text(
            text = "Daily Quests",
            Modifier
                .padding(
                    horizontal = 15.dp,
                    vertical = 20.dp
                )
                .fillMaxWidth(),
            fontSize = 50.sp,
            color = invc()
        )
        Text(
            text = "Refreshes Every 24 Hours",
            Modifier
                .padding(
                    horizontal = 20.dp,
                )
                .fillMaxWidth(),
            fontSize = 18.sp,
            color = invc()
        )
        Text(
            text = "Short Term Tasks",
            Modifier
                .padding(top = 20.dp)
                .padding(
                    horizontal = 20.dp,
                    vertical = 5.dp
                )
                .fillMaxWidth(),
            fontSize = 12.sp,
            color = invc(),
            textAlign = TextAlign.Center
        )
    }
}