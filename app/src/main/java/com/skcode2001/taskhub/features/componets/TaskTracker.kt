package com.skcode2001.taskhub.features.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.ui.theme.darkBlue
import com.skcode2001.taskhub.ui.theme.mainBackground
import com.skcode2001.taskhub.ui.theme.white

@Composable
fun TaskTracker() {
    Box(modifier = Modifier.padding(bottom = 15.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
//                .height(300.dp)
                .background(color = darkBlue, shape = RoundedCornerShape(10.dp))
                .padding(all = 10.dp)
        ) {
            Column {
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    )
                {
                    Box(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .background(color = mainBackground)
                    ) {

                        Icon(
                            imageVector = Icons.Outlined.AccountBox,
                            contentDescription = "",
                            tint = white,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                    Text("Practice for marathon", color = white, fontWeight = FontWeight.Bold, fontSize = 20.sp)


                    Box(
                        modifier = Modifier.padding(end = 10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Outlined.CheckCircle,
                            contentDescription = "",
                            tint = white,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                }

                LazyRow(modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp),
                    ) {
                    items (250){ j ->
                        Column {
                            for (i in 0 until 7) {
                                Box(modifier = Modifier.padding(3.dp)) {
                                    Box(
                                        modifier = Modifier
                                            .background(
                                                color = Color(0xFF111922),
                                                shape = RoundedCornerShape(2.dp)
                                            )
                                            .height(15.dp)
                                            .width(15.dp)
                                    ) {

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