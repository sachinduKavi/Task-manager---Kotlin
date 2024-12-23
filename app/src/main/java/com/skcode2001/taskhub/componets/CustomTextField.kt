package com.skcode2001.taskhub.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skcode2001.taskhub.ui.theme.white

@Composable
fun CustomTextField(label: String, nameHolder: MutableState<String>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(label, color = white, fontSize = 14.sp, modifier = Modifier.padding(bottom = 3.dp))

        TextField(
            value =  nameHolder.value,
            onValueChange = { nameHolder.value = it},
            modifier = Modifier.fillMaxWidth().height(50.dp),
            textStyle = TextStyle(color = Color.Black)
        )
    }
}