package com.skcode2001.taskhub.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDown(){

    val list = listOf("None","Daily","Week","Month")
    var selectedText by remember {
        mutableStateOf(list[0])
    }
    var isExpanded by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        ExposedDropdownMenuBox(
            expanded = isExpanded ,
            onExpandedChange = {isExpanded = !isExpanded},
            modifier = Modifier.fillMaxWidth(),
        ) {
            TextField(
                modifier = Modifier.menuAnchor().fillMaxWidth(),
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)},
                textStyle = androidx.compose.ui.text.TextStyle(color = Color.Black),

            )
            ExposedDropdownMenu(
                expanded = isExpanded ,
                onDismissRequest = {isExpanded=false},
                modifier = Modifier.width(500.dp)
                )

            {
                list.forEachIndexed{index , text ->
                    DropdownMenuItem(
                        text= {
                            Text(text=text, color = Color.Black)},
                        onClick ={
                            selectedText = list[index]
                            isExpanded=false

                                 } ,
                        modifier = Modifier.fillMaxWidth(),
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }
    }
}