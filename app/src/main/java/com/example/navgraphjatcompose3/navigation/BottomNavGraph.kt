package com.example.navgraphjatcompose3.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgraphjatcompose3.BottomBarScreen
import com.example.navgraphjatcompose3.HomeScreen
import com.example.navgraphjatcompose3.LogInScreen

fun NavGraphBuilder.bottomNavGraph(navHostController: NavHostController){
    navigation(
        startDestination = Screens.Home.route,
        route = BOTTOM_ROUTE
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navHostController)
        }
        composable(route = BottomBarScreen.LogIn.route){
            LogInScreen(navHostController)
        }
    }

}