package com.example.weatherapp.ui.nav

import MainViewModel
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weatherapp.ui.HomePage
import com.example.weatherapp.ui.ListPage
import com.example.weatherapp.ui.MapPage

@Composable
fun MainNavHost(navController: NavHostController, mainViewModel: MainViewModel) {
    NavHost(navController, startDestination = Route.Home) {
        composable<Route.Home> { HomePage(viewModel = mainViewModel) }
        composable<Route.List> { ListPage(viewModel = mainViewModel) }
        composable<Route.Map> { MapPage(viewModel = mainViewModel) }
    }
}
