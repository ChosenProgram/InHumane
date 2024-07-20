package com.benevolence.inhumane

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun BenevolenceUI(
) {
    Box {
        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface)
                .verticalScroll(rememberScrollState())
        ){
            TitleOutskirts()
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

