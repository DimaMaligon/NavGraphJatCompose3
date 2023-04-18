package com.example.navgraphjatcompose3.navigation

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"

const val AUTH_ROUTE = "auth"
const val BOTTOM_ROUTE = "bottom"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screens(val route: String) {
    object LogIn : Screens(route = "login_screen")
    object SignUp : Screens(route = "sign_up_screen")

    object Home : Screens(route = "home_screen")
    object Detail : Screens(route = "detail_screen/{$DETAIL_ARGUMENT_ID}/{$DETAIL_ARGUMENT_NAME}")


    fun passId(id: Int): String {
        return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_ID}", newValue = id.toString())
    }
    fun passNameAndId(id: Int, name: String): String {
        return "detail_screen/$id/$name"
    }
}
