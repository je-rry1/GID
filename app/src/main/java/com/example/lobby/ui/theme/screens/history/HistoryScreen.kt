package com.example.lobby.ui.theme.screens.history

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.navigation.FORM_URL
import com.example.lobby.navigation.HISTORY_URL
import com.example.lobby.navigation.HOME_URL
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(navController: NavHostController) {
   Column(
       modifier = Modifier.fillMaxSize()
           .background(beige)
   ) {

           TopAppBar(modifier = Modifier.background(white),
               title = { Text(text = "Secure your account",
                   fontFamily = FontFamily.Cursive)},
               colors = TopAppBarDefaults.mediumTopAppBarColors(beige),
               navigationIcon = {
                   IconButton(onClick = { /*TODO*/ }) {
                       Icon(imageVector = Icons.Default.Menu,
                           contentDescription = "menu")
                   }
               }
           )


       Text(text = "GID will need you to set up a pin that you can remember in order to complete your registration.",
           fontFamily = FontFamily.Cursive,
           fontSize = 10.sp,
           modifier = Modifier.align(Alignment.CenterHorizontally))
       Spacer(modifier = Modifier.height(20.dp))

       Text(text = "Create your secure PIN",
           fontFamily = FontFamily.Cursive,
           modifier = Modifier.align(Alignment.CenterHorizontally),
           fontSize = 10.sp)

       Spacer(modifier = Modifier.height(20.dp))



       Text(text = "Confirm your  PIN",
           fontFamily = FontFamily.Cursive,
           modifier = Modifier.align(Alignment.CenterHorizontally),
           fontSize = 10.sp)
       Button(onClick = {
           navController.navigate(FORM_URL)
       },
           modifier = Modifier
               .padding(bottom = 1.dp)
       ){
           Text(text = "Continue")
       }
   }

}


@Preview(showBackground = true)
@Composable
fun HistoryScreenPreview() {
    HistoryScreen(rememberNavController())
}