package com.example.navgraphjatcompose3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navgraphjatcompose3.navigation.AUTH_ROUTE
import com.example.navgraphjatcompose3.navigation.Screens

@Composable
fun HomeScreen(navHostController: NavHostController) {
  Scaffold(
      bottomBar = { BottomBar(navHostController = navHostController)},
      content = { padding ->
          Column(modifier = Modifier.padding(padding)) {
              ContentHomeScreen(navHostController = navHostController)
          }
      }
  )
}

@Composable 
fun ContentHomeScreen (navHostController: NavHostController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column() {

            Text(
                modifier = Modifier.clickable {
                    navHostController.navigate(route = Screens.Detail.passNameAndId(5, "ngoo"))
                },
                text = "Home",
                color = Color.Green,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.clickable {
                    navHostController.navigate(AUTH_ROUTE)
                },
                text = "LogIn/SignUp",
                color = Color.Black,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }    
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(navHostController = rememberNavController())
}