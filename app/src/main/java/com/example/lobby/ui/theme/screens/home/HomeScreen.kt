package com.example.lobby.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.Settings
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lobby.LocationActivity
import com.example.lobby.R
import com.example.lobby.ui.theme.beige

data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(beige),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var mContext = LocalContext.current



        var selected by remember { mutableIntStateOf(0) }

        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                // navController.navigate(HOME_URL)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                androidx.compose.material3.Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    androidx.compose.material3.Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                androidx.compose.material3.Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },


            topBar = {
                androidx.compose.material3.TopAppBar(
                    title = { androidx.compose.material3.Text(text = "Home") },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(beige),
                    navigationIcon = {
                        androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                            androidx.compose.material3.Icon(imageVector = Icons.Default.Menu,
                                contentDescription = "menu")
                        }
                    }
                )
            }
        )
        {
            Column (
                modifier = Modifier
                    .padding(start = 10.dp))
            {
                //Row
                Row (modifier = Modifier

                    .padding(start = 50.dp, top = 30.dp)){
                    //Column
                    Column (
                        Modifier.padding(top = 30.dp)
                    ){
                        androidx.compose.material3.Text(text = "GID", fontSize = 35.sp, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Cursive)
                        androidx.compose.material3.Text(text = "Save money through GID", fontSize = 15.sp)
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    //End of column
                    Image(painter = painterResource(id = R.drawable.coin7),
                        contentDescription = "amazon",
                        modifier = Modifier.size(100.dp))
                }
                //End of row
                Spacer(modifier = Modifier.height(30.dp))
                //Column
                Column (modifier = Modifier.padding(start = 20.dp)){
                    //Row1
                    Row {
                        //Card1
                        Card (modifier = Modifier.size(width = 150.dp, height = 110.dp)) {
                            //Semi-column
                            Column {
                                var mContext = LocalContext.current
                                //Box
                                Box (modifier = Modifier
                                    .size(50.dp)
                                    .padding(top = 8.dp, start = 4.dp)
                                    .clickable {
                                        val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                    },
                                    contentAlignment = Alignment.Center)
                                {
                                    Image(painter = painterResource(id = R.drawable.plus),
                                        contentDescription = "wow",
                                        modifier = Modifier.size(50.dp)
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Add funds",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card1

                        Spacer(modifier = Modifier.width(30.dp))

                        // Card2
                        Card (modifier = Modifier.size(width = 150.dp, height = 110.dp)) {
                            //Semi-column
                            Column {
                                //Box
                                Box (modifier = Modifier.size(50.dp)
                                    .clickable {
                                        val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                    }
                                    , contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.pn),
                                        contentDescription = "wow",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(top = 8.dp, start = 4.dp)
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Funds transfer",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card2
                    }
                    //End of row1

                    Spacer(modifier = Modifier.height(30.dp))

                    //Row2
                    Row {
                        //Card1
                        Card (modifier = Modifier.size(width = 150.dp, height = 110.dp)) {
                            //Semi-column
                            Column {
                                var mContext = LocalContext.current
                                //Box
                                Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.smartphone),
                                        contentDescription = "wow",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(top = 8.dp, start = 4.dp)
                                            .clickable {
                                                val simToolKitLaunchIntent =
                                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                                                Toast
                                                    .makeText(
                                                        mContext, "Clicked on main image",
                                                        Toast.LENGTH_LONG
                                                    )
                                                    .show()
                                            },
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Airtime Top-Up",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card1

                        Spacer(modifier = Modifier.width(30.dp))

                        // Card2
                        Card (modifier = Modifier.size(width = 150.dp, height = 110.dp)) {
                            //Semi-column
                            Column {
                                //Box
                                Box (modifier = Modifier.size(50.dp)
                                    .clickable {
                                        val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                    }
                                    , contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.receipt),
                                        contentDescription = "wow",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(top = 8.dp, start = 4.dp)
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Pay Bills",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card2
                    }
                    //End of row2
                    Spacer(modifier = Modifier.height(30.dp))

                    //Row3
                    Row {
                        //Card1
                        var mContext = LocalContext.current
                        Card (modifier = Modifier
                            .size(width = 150.dp, height = 110.dp)
                            .padding(top = 8.dp, start = 4.dp)

                        ) {
                            //Semi-column
                            Column {
                                //Box
                                Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.goods),
                                        contentDescription = "wow",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(top = 8.dp, start = 4.dp)
                                            .clickable {
                                                val simToolKitLaunchIntent =
                                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                            }
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Buy Goods",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card1

                        Spacer(modifier = Modifier.width(30.dp))

                        // Card2
                        Card (modifier = Modifier.size(width = 150.dp, height = 110.dp)) {
                            //Semi-column
                            Column {
                                //Box
                                Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.wallet),
                                        contentDescription = "wow",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(top = 8.dp, start = 4.dp)
                                            .clickable {
                                                val simToolKitLaunchIntent =
                                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                            }
                                    )
                                }
                                //End of Box
                                Spacer(modifier = Modifier.height(3.dp))
                                androidx.compose.material3.Text(text = "Pochi la Biashara",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start)
                            }
                            //End of semi-column
                        }
                        //End of card2
                    }
                    //End of row3
                    Spacer(modifier = Modifier.height(30.dp))

                }
            }
        }
    }

}
val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "contact",
        route="support",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "about",
        route="about",
        selectedIcon=Icons.Filled.Face,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = false,
        badges=0
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}

