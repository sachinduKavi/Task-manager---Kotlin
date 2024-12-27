package com.skcode2001.taskhub.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconGrid(icons: List<Int>, iconsPerRow: Int) {

    val selectedIcon = remember { mutableStateOf<Int?>(null) }
    Column(
        modifier = Modifier
            .fillMaxWidth(),

        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Split the icons list into chunks of `iconsPerRow`
        icons.chunked(iconsPerRow).forEach { rowIcons ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // For each icon in the current row
                rowIcons.forEach { iconRes ->
                    val isSelected = selectedIcon.value == iconRes
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RectangleShape)
                            .border(
                                width = 2.dp,
                                color = if (isSelected) Color.White else Color.Transparent,
                                shape = RectangleShape
                            )
                            .clickable { selectedIcon.value = iconRes},
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = iconRes),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp).padding(5.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
}
