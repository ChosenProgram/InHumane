package com.benevolence.inhumane

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InButtons(
    text : String,
    modifier: Modifier,
    color : Color
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(90.dp, 45.dp)
            .padding(3.dp)
            .clip(RoundedCornerShape(100.dp))
    ){
        Text(
            text = text,
            fontSize = 13.sp,
            color = color
        )
    }
}