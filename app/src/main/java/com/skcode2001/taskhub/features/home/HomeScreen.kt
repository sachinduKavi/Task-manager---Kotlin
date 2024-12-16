package com.skcode2001.taskhub.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.ui.theme.mainBackground
import com.skcode2001.taskhub.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    Scaffold (
        containerColor = MaterialTheme.colorScheme.background,

        topBar = {
            TopAppBar(
                title = {
                    Row {
                        Text("Task",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text("Hub",
                            color = Color(0xFF9354D5),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                        },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = mainBackground, // Set the background color
                    titleContentColor = white // Set the text color
                ))
        },

        content = {padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Hello World $name")
            }
        }
    )
}