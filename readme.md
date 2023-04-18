The app has four screens: DetailScreen.kt, HomeScreen.kt, LogInScreen.kt, SignUpScreen.kt
I used nested graph in this app. NavGraph.kt file consist of teh NavHost, which include two graphs itself.
HomeNavGraph.kt has DetailScreen.kt, HomeScreen.kt and AuthNavGraph.kt has LogInScreen.kt, SignUpScreen.kt
Also I made bottomBar, it was made with BottomBar.kt, which has two functions: BottomBar() used BottomNavigation() that
add whole list of screens, fun RowScope.AddItem() used BottomNavigationItem() that create item of bar.
For bottomBar also need to use a graph thus I created NavGraphBuilder.bottomNavGraph which helps us with navigation.
