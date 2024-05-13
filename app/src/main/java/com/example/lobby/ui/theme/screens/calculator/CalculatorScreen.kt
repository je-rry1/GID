package com.example.lobby.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.data.AuthViewModel
import com.example.lobby.navigation.UPLOAD_URL
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.sign
import com.example.lobby.ui.theme.white

@Composable
fun CalculatorScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(beige)
            .paint(
                painterResource(id = R.drawable.coins
                ),
                contentScale = ContentScale.FillHeight
            )
            .padding(top = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Apply Loan",
            fontSize = 60.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            color = sign
        )
        Spacer(modifier = Modifier.height(10.dp))

        var Loanamount by remember { mutableStateOf("") }
        var Duration by remember { mutableStateOf("") }
        var context = LocalContext.current

        OutlinedTextField(
            value =Loanamount ,
            onValueChange = {Loanamount = it},
            placeholder = { Text(text = "Enter your loan amount") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value =Duration ,
            onValueChange = {Duration = it},
            placeholder = { Text(text = "Enter the duration  required to pay") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .background(white),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,)
        )
        Spacer(modifier = Modifier.height(10.dp))
        val authViewModel = AuthViewModel(navController,context)

        Button(onClick = {
            navController.navigate(UPLOAD_URL)

        }) {
            Text(text = "Continue") }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen(rememberNavController())
}