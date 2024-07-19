package com.benevolence.inhumane

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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