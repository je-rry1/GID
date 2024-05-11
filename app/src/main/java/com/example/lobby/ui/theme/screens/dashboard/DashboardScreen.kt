package com.example.firebasestorage.screens.about

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.R
import com.example.lobby.navigation.HOME_URL
import com.example.lobby.ui.theme.Purple500
import com.example.lobby.ui.theme.beige

@Composable
fun DashboardScreen(navController: NavHostController) {

    val mContext= LocalContext.current
    Row (
        Modifier.horizontalScroll(rememberScrollState())
    ){
        //Column1
        Card(modifier= Modifier
            .fillMaxSize()
            .background(beige))
        {
            Spacer(modifier = Modifier.height(30.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                , contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.app2),
                    contentDescription ="Canada",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)

            }

            Spacer(modifier = Modifier.height(10.dp))


            Text(text = "Wallet",
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold)

            Spacer(modifier = Modifier.height(15.dp))


            Text(text = "Transfer, paybills and buy goods using GID",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp)

            Spacer(modifier = Modifier.height(20.dp))



        }
        //End of column1
        //Column2
        Card(modifier= Modifier
            .fillMaxSize()
            .background(beige))
        {
            Spacer(modifier = Modifier.height(30.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                , contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.app1),
                    contentDescription ="Canada",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)

            }

            Spacer(modifier = Modifier.height(10.dp))


            Text(text = "Wallet",
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold)

            Spacer(modifier = Modifier.height(15.dp))


            Text(text = "Save money using GID",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp)

            Spacer(modifier = Modifier.height(20.dp))




        }

        //End of column2
        //Last
        Card {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                , contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.app1),
                    contentDescription ="Canada",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)

            }

            Button(onClick = {

                navController.navigate(HOME_URL)
                Toast.makeText(mContext, "wallet", Toast.LENGTH_LONG)
                    .show()
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                colors = ButtonDefaults.buttonColors(Purple500),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "View Wallet")

            }
        }


    }



}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())

}
