package com.example.navgraphjatcompose3.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgraphjatcompose3.LogInScreen
import com.example.navgraphjatcompose3.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(
        startDestination = Screens.LogIn.route,
        route = AUTH_ROUTE
    ){
        composable(
            route = Screens.LogIn.route
        ) {
            LogInScreen(navController)
        }
        composable(
            route = Screens.SignUp.route
        ) {
            SignUpScreen(navController)
        }
    }
}