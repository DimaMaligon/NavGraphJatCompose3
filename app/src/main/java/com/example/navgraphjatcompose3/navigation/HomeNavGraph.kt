package com.example.navgraphjatcompose3.navigation

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.navgraphjatcompose3.DetailScreen
import com.example.navgraphjatcompose3.HomeScreen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController){
navigation(
    startDestination = Screens.Home.route,
    route = HOME_ROUTE
){
    composable(
        route = Screens.Home.route
    ) {
        HomeScreen(navController)
    }
    composable(
        route = Screens.Detail.route,
        arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
            type = NavType.IntType
        },
            navArgument(DETAIL_ARGUMENT_NAME) {
                type = NavType.StringType
            }),
    ) {
        Log.d("dddd1", it.arguments?.getInt(DETAIL_ARGUMENT_ID).toString())
        Log.d("dddd2", it.arguments?.getString(DETAIL_ARGUMENT_NAME).toString())
        DetailScreen(navController)
    }

}
}