package com.example.lobby.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.screens.about.DashboardScreen
import com.example.firebasestorage.screens.contact.SupportScreen
import com.example.lobby.screens.home.HomeScreen
import com.example.lobby.screens.products.UploadScreen
import com.example.lobby.ui.theme.screens.about.Aboutus
import com.example.lobby.ui.theme.screens.account.AccountScreen
import com.example.lobby.ui.theme.screens.calculator.CalculatorScreen
import com.example.lobby.ui.theme.screens.form.FormScreen
import com.example.lobby.ui.theme.screens.history.HistoryScreen
import com.example.lobby.ui.theme.screens.login.LoginScreen
import com.example.lobby.ui.theme.screens.signup.SignupScreen
import com.example.lobby.ui.theme.screens.splash.SplashScreen
import com.example.lobby.ui.theme.screens.upload.ViewUploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = SPLASH_URL) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(HOME_URL){
            HomeScreen(navController)
        }
        composable(ABOUT_URL){
            Aboutus(navController)
        }

        composable(LOGIN_URL){
            LoginScreen(navController)
        }
        composable(UPLOAD_URL){
            UploadScreen(navController)
        }
        composable(VIEW_UPLOAD_URL){
            ViewUploadScreen(navController)
        }

        composable(DASHBOARD_URL){
            DashboardScreen(navController)
        }
        composable(CALCULATOR_URL){
            CalculatorScreen(navController)
        }
        composable(FORM_URL){
            FormScreen(navController)
        }
        composable(SPLASH_URL){
            SplashScreen(navController)
        }
        composable(ACCOUNT_URL) {
            AccountScreen(navController)
        }
        composable(HISTORY_URL) {
            HistoryScreen(navController)
        }
        composable(SUPPORT_URL) {
            SupportScreen(navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController)
        }

    }
}