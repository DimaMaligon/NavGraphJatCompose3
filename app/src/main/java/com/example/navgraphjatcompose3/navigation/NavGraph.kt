package com.example.navgraphjatcompose3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    )
    {
        homeNavGraph(navController)
        authNavGraph(navController)
        bottomNavGraph(navController)
    }
}