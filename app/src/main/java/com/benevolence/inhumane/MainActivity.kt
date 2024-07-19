package com.benevolence.inhumane

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.benevolence.inhumane.ui.theme.InHumaneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InHumaneTheme {
                BenevolenceUI()
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Light Mode"
)
@Composable
fun PreviewWiseLight(){
    BenevolenceUI()
}