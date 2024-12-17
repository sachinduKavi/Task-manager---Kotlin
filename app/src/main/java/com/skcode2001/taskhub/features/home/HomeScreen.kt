package com.skcode2001.taskhub.features.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.skcode2001.taskhub.ui.theme.mainBackground
import com.skcode2001.taskhub.ui.theme.white

fun apiCall() {

    println("hello WOrld")
    Log.d("debug", "Hello world")
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    Scaffold (
        containerColor = MaterialTheme.colorScheme.background,

        topBar = {
            TopAppBar(
                title = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(

                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier.padding(end = 10.dp)
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Settings,
                                    contentDescription = "Settings icon",
                                    tint = white,
                                    modifier = Modifier.size(32.dp)
                                )
                            }
                            Text(
                                "Task",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                "Hub",
                                color = Color(0xFF9354D5),
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            modifier = Modifier.padding(end = 0.dp)
                        ) {

                            Button(onClick = { apiCall() }) {
                                Icon(
                                    imageVector = Icons.Outlined.AddCircle,
                                    contentDescription = "Settings icon",
                                    tint = white,
                                    modifier = Modifier.size(32.dp)
                                )
                            }
                        }
                    }
                        },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = mainBackground, // Set the background color
                    titleContentColor = white // Set the text color
                ))
        },

        content = {padding ->
            LazyColumn(modifier = Modifier.padding(padding).fillMaxSize()) {
                items(10) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(padding),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Hi $name", color = white)
                    }
                }
            }
        }
    )
}