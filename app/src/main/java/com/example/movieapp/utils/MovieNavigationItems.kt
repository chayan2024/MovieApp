package com.example.movieapp.utils

sealed class MovieNavigationItems(val route:String){

    object MovieList : MovieNavigationItems("movielist")
    object MovieDetails : MovieNavigationItems("movieDetails")

}
