package com.skcode2001.taskhub.features.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.ui.theme.white

@Composable
fun CustomTextField(label: String, nameHolder: MutableState<String>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(label, color = white, fontSize = 14.sp)
        TextField(nameHolder,

            onValueChange = { nameHolder.value = nameHolder.value},
            modifier = Modifier.fillMaxWidth(),

        )
    }
}