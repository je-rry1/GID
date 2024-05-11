package com.example.lobby.ui.theme.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.data.AuthViewModel
import com.example.lobby.navigation.ACCOUNT_URL
import com.example.lobby.navigation.CALCULATOR_URL
import com.example.lobby.navigation.DASHBOARD_URL
import com.example.lobby.navigation.LOGIN_URL
import com.example.lobby.navigation.UPLOAD_URL
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.sign
import com.example.lobby.ui.theme.white

@Composable
fun FormScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
            .background(beige)
            .paint(
                painterResource(id = R.drawable.coins1
                ),
                contentScale = ContentScale.FillHeight
            )
            .padding(top = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        var career by remember { mutableStateOf("") }
        var income by remember { mutableStateOf("") }
        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }
        var location by remember { mutableStateOf("") }
        var context = LocalContext.current


        Text(text = "Personal Details",
            fontSize = 10.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            color = sign
        )
        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value =firstname ,
            onValueChange = {firstname = it},
            placeholder = { Text(text = "Firstname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value =lastname ,
            onValueChange = {lastname = it},
            placeholder = { Text(text = "Lastname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value =email ,
            onValueChange = {email = it},
            placeholder = { androidx.compose.material3.Text(text = "Email Address")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email,)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = contact,
            onValueChange = {contact = it},
            placeholder = { androidx.compose.material3.Text(text = "Phone Number")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "Call")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone,)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = location,
            onValueChange = {location = it},
            placeholder = { Text(text = "Location") },
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Call") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(DASHBOARD_URL)
        }) {
            Text(text = "Login")
        }

    }
    }




@Preview(showBackground = true)
@Composable
fun FormScreenPreview() {
    FormScreen(rememberNavController())
}