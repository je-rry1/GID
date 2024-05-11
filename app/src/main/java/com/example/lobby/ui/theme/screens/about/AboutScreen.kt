package com.example.lobby.ui.theme.screens.about

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lobby.navigation.UPLOAD_URL
import com.example.lobby.ui.theme.Purple500
import com.example.lobby.ui.theme.beige
import com.example.lobby.ui.theme.blue

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aboutus()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Aboutus(){
    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()
        .background(beige)) {

        androidx.compose.material3.TopAppBar(title = {
            androidx.compose.material3.Text(
                text = "About app",
                color = Color.Black
            )
        },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple500),
            navigationIcon = {
                androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "",
                        tint = Color.White
                    )

                }


            },


            )
        Text(text = "About us",
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.Black,
            fontSize = 25.sp,

            )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
            ,text = "\uD83C\uDF1F Welcome to GID!\n" +
                    "\n" +
                    "Hello there! I'm Janelle Alimu, the Founder and the CEO of GID. I'm thrilled to have you here and share a bit about our story.\n" +
                    "\n" +
                    "Welcome to our savings app! We're on a mission to empower you to take control of your finances and achieve goals with ease.Our user-friendly interface makes saving simplewhileour top-notch security measures ensureyour peace of mind. Whether you're saving for a rainy day or a big dream,we're here to support you every step of the way.Join us on your journey to [your main focus or purpose].\n" +
                    "\n" +

                    "Thank you for being a part of the GID community. Feel free to reach out if you have any questions or just want to say hello!\n" +
                    "\n" +
                    "Cheers,\n" +
                    "[Janelle Alimu")







    }


}
@Preview(showBackground = true)
@Composable
fun AboutusPreview(){
    Aboutus()
}