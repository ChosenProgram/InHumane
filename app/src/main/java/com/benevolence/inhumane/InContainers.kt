package com.benevolence.inhumane

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InContainers(
    title : String,
    subtitle : String,
    diff  : String,
    icon : Painter
){
    Box (
        Modifier
            .size(450.dp, 170.dp)
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.surfaceContainer)
    ){
        Column(
            Modifier
                .padding(15.dp)
                .size(450.dp, 190.dp)
        ) {
            Row (
                Modifier
                    .size(360.dp, 80.dp)
                    .padding(10.dp)
            ){
                Iconographic(diff, icon)
                Column /*The Content*/(
                    Modifier
                        .size(250.dp, 130.dp)
                        .padding(horizontal = 20.dp),
                    verticalArrangement = Arrangement.Center
                ){
                    Title(
                        title,
                        subtitle
                    )
                }
            }
            Row /*The Buttons*/ (
                Modifier
                    .size(400.dp, 120.dp),
                horizontalArrangement = Arrangement.End,
                ){
                InButtons(
                    text = "Replace",
                    Modifier,
                    MaterialTheme.colorScheme.primary
                )
                InButtons(
                    text = "Open",
                    Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(MaterialTheme.colorScheme.primary),
                    MaterialTheme.colorScheme.inversePrimary
                )
            }
        }
    }
}

@Composable
fun Title (
    title : String,
    sub : String
){
    Column(
        Modifier
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            color = invc()
        )
        Row(
            Modifier
                .padding(top = 8.dp)
        ){
            Box (
                Modifier
                    .size(18.dp)
                    .align(Alignment.CenterVertically),
            ){
                Icon(
                    painter = painterResource(R.drawable.description_highlight),
                    contentDescription = null,
                    tint = invc(),
                )
            }
            Text(
                text = sub,
                Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically),
                fontSize = 12.sp,
                color = invc()
            )
        }
    }
}

@Composable
fun Iconographic(diff : String, icon : Painter){
    Box(
        Modifier
            .size(60.dp, 100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.surfaceContainer)
    ){
        Box(
            Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(100.dp))
                .align(Alignment.BottomEnd)
        ){
            Icon(
                painter = icon,
                contentDescription = null,
                Modifier
                    .align(Alignment.Center)
                    .size(45.dp),
                tint = invc()
            )
        }
        Box(
            Modifier
                .size(30.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(invc2(diff))
                .align(Alignment.TopStart)
        ){
            Text(
                text = diff,
                Modifier
                    .align(Alignment.Center),
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}