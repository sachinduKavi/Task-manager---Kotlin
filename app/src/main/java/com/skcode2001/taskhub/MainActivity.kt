package com.skcode2001.taskhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.skcode2001.taskhub.features.home.HomeScreen
import com.skcode2001.taskhub.ui.theme.DarkColorScheme
import com.skcode2001.taskhub.ui.theme.TaskHubTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme (
                colorScheme = DarkColorScheme
            ){

                Surface {
                    HomeScreen(name = "Sachindu Kavishka")
                }
            }
        }
    }
}


