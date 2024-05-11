package com.example.lobby.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.navigation.LOGIN_URL
import com.example.lobby.ui.theme.beige
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                navController.navigate(LOGIN_URL)
            }
            .background(beige),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        val couroutineScope = rememberCoroutineScope()
        couroutineScope.launch {
            delay(2000)
            navController.navigate(LOGIN_URL)
        }
    }

    Image(painter = painterResource(id = R.drawable.applogo),
        contentDescription = "back", Modifier.size(600.dp).padding(top = 50.dp))

}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}