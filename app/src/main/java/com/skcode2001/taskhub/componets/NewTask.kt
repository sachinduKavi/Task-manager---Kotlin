package com.skcode2001.taskhub.componets

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.R
import com.skcode2001.taskhub.components.IconGrid
import com.skcode2001.taskhub.ui.theme.transparentDark
import com.skcode2001.taskhub.ui.theme.white
import com.skcode2001.taskhub.models.ValueList
import com.skcode2001.taskhub.sql_helper.Task


@Composable
fun NewTask(padding: PaddingValues, overLayOn: MutableState<Boolean>) {



    var icons = ValueList.icons
    var name = remember { mutableStateOf("") }
    var description = remember { mutableStateOf("") }
    var selectedColor = remember { mutableStateOf(1) }
    var goal = remember {
        mutableStateOf("None")
    }
    var expanded = remember { mutableStateOf(false) }
    var selectOption = remember { mutableStateOf("select an option") }
    val colors = ValueList.colors


    fun submission() {
//        val task = Task(
//            name = name.value,
//            description = description.value,
//            goal = goal.value
//            icon =
//            )
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(padding)
        .background(color = transparentDark)
        .clickable(
            indication = null,
            interactionSource = remember {
                MutableInteractionSource()
            },
            onClick = {}
        ),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize(),
        ) {

            item {
                Box {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .size(32.dp)
                                    .clickable {
                                        Log.d("sk", "Hello World")
                                        overLayOn.value = false
                                    },
                                imageVector = Icons.Filled.Close,
                                contentDescription = "Cross Icon",
                                tint = white,
                            )

                            Text(
                                text = "New Habit", color = white, fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = null,
                            tint = white,
                            modifier = Modifier
                                .size(32.dp)
                                .clickable { submission() }
                        )
                    }
                }
            }




            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                ) {
                    CustomTextField("Name", name)
                    CustomTextField("Description", description)




                    Column {
                        Text(
                            text = "Streak Goal",
                            color = Color.White,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        DropDown(goal)
                    }


                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Icons",
                        color = white
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    IconGrid(icons, 7)


                    Column {
                        Text(
                            text = "Colour",
                            color = Color.White,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )

                        // Display 26 color boxes
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                colors.chunked(7).forEach { rowColors ->
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceEvenly
                                    ) {
                                        rowColors.forEach { color ->
                                            Box(
                                                modifier = Modifier
                                                    .size(40.dp)
                                                    .clip(RoundedCornerShape(12.dp))
                                                    .background(color)
                                                    .clickable {
//                                                        selectedColor.value = color
                                                    }
                                                    .padding(4.dp),
                                                contentAlignment = Alignment.Center
                                            ) {
//                                                if (selectedColor.value == color) {
//                                                    Box(
//                                                        modifier = Modifier
//                                                            .size(24.dp)
//                                                            .clip(CircleShape)
//                                                            .background(Color.White)
//                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }




                    }

                }
            }

            }



        }

