package com.example.movieapp.features.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieapp.utils.MovieNavigationItems
import com.example.movieapp.features.movies.screens.MovieDetailScreen
import com.example.movieapp.features.movies.screens.MovieListScreen
import com.example.movieapp.features.movies.ui.MovieViewModel

@Composable
fun MovieNavigation(
    viewModel: MovieViewModel
) {

    val navHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = MovieNavigationItems.MovieList.route
    ) {
        composable(MovieNavigationItems.MovieList.route){
            MovieListScreen(viewModel = viewModel, navHostController = navHostController)
        }
        composable(MovieNavigationItems.MovieDetails.route){
            MovieDetailScreen(viewModel)
        }
    }

}