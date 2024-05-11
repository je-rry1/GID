package com.example.lobby.ui.theme.screens.account

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.navigation.HISTORY_URL
import com.example.lobby.navigation.UPLOAD_URL
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.sign
import com.example.lobby.ui.theme.white

@Composable
fun AccountScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(beige)
        .padding(top = 70.dp, start = 20.dp))
    {

        var contact by remember { mutableStateOf("") }

        Text(text = "Please verify your mobile number",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = sign
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Mobile Number",
            fontSize = 15.sp,
            fontFamily = FontFamily.Cursive,
            color = sign
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = contact,
            onValueChange = {contact = it},
            placeholder = { Text(text = "Phone Number") },
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "Call") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 2.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone,)
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            navController.navigate(HISTORY_URL)
        },
            modifier = Modifier
                .padding(bottom = 1.dp).align(Alignment.CenterHorizontally)
        ){
            Text(text = "Verify")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun AccountScreenPreview() {
    AccountScreen(rememberNavController())
}