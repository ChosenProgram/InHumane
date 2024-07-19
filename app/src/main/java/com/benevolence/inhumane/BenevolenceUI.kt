package com.benevolence.inhumane

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BenevolenceUI(
    modifier: Modifier = Modifier,
) {
    Box {
        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface)
        ){
            items(1) {
                TitleOutskirts(modifier)
                InContainers(
                    "Bleep Toot Bleeeeep",
                    "Learn Morse Code",
                    "A",
                    painterResource(R.drawable.pen_icon)
                )
                InContainers(
                    "Tsk Tassel Flips",
                    "Fold Any Origami",
                    "C",
                    painterResource(R.drawable.handyman)
                )
                InContainers(
                    "Not Bye-Bayin",
                    "Fold Any Origami",
                    "B",
                    painterResource(R.drawable.language)
                )
                InContainers(
                    "Not Bye-Bayin",
                    "Fold Any Origami",
                    "B",
                    painterResource(R.drawable.language)
                )
                InContainers(
                    "Not Bye-Bayin",
                    "Fold Any Origami",
                    "B",
                    painterResource(R.drawable.language)
                )
                Nav()
            }
        }
    }
}

@Composable
fun TitleOutskirts(modifier : Modifier){
    Column (
        modifier = modifier
            .padding(top =150.dp)
    ){
        Text(
            text = "Daily Quests",
            modifier = modifier
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
            modifier = modifier
                .padding(
                    horizontal = 20.dp,
                )
                .fillMaxWidth(),
            fontSize = 18.sp,
            color = invc()
        )
        Text(
            text = "Short Term Tasks",
            modifier = modifier
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