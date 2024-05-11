package com.example.lobby.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.data.AuthViewModel
import com.example.lobby.navigation.FORM_URL
import com.example.lobby.navigation.SIGNUP_URL
import com.example.lobby.navigation.UPLOAD_URL
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.sign

@Composable
fun LoginScreen(navController: NavController){
        Column(
            modifier = Modifier.fillMaxSize()
                .background(beige),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "Login",
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
                color = sign
            )

            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.coin2),
                    contentDescription = "back",
                    modifier = Modifier
                        .size(180.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
            }
            val email = remember { mutableStateOf("") }
            val password = remember { mutableStateOf("") }
            var context = LocalContext.current
            var xyz = AuthViewModel(navController, context)

            TextField(
                value = email.value,
                onValueChange = { email.value = it },
                label = { Text("Email") },
                modifier = Modifier.padding(16.dp)
            )

            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text("Password") },
                modifier = Modifier.padding(16.dp),
            )

            Button(
                onClick = {
                    navController.navigate(UPLOAD_URL)
                    // Perform login action

                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Login")
            }

            Button(onClick = {
                navController.navigate(SIGNUP_URL)
            }) {
                Text(text = "No existing account? Signup") }
        }
        }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginScreen(rememberNavController())
}
