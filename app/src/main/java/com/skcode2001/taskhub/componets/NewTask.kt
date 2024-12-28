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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.R
import com.skcode2001.taskhub.components.IconGrid
import com.skcode2001.taskhub.ui.theme.transparentDark
import com.skcode2001.taskhub.ui.theme.white


@Composable
fun NewTask(padding: PaddingValues, overLayOn: MutableState<Boolean>) {

    var icons = listOf(
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5,
        R.drawable.icon6,
        R.drawable.icon7,
        R.drawable.icon8,
        R.drawable.icon9,
        R.drawable.icon10,
        R.drawable.icon11,
        R.drawable.icon12,
        R.drawable.icon13,
        R.drawable.icon14,
        R.drawable.icon15,
        R.drawable.icon16,
        R.drawable.icon17,
        R.drawable.icon18,
        R.drawable.icon19,
        R.drawable.icon20,
        R.drawable.icon21,
    )
    var name = remember { mutableStateOf("") }
    var description = remember { mutableStateOf("") }

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
        Column(modifier = Modifier
            .fillMaxSize(),
        ) {

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .size(32.dp)
                            .clickable{
                                Log.d("sk", "Hello World")
                                overLayOn.value = false
                            },
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Cross Icon",
                        tint = white,
                    )

                    Text(text = "New Habit", color = white, fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    tint = white,
                    modifier = Modifier.size(32.dp)
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                CustomTextField("Name", name)
                CustomTextField("Description", description)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Icons",
                    color = white
                )
                Spacer(modifier = Modifier.height(10.dp))
                IconGrid(icons,7)
            }

        }
    }
}