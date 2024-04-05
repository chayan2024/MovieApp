package com.example.movieapp.features.movies.ui

import com.example.movieapp.features.movies.domain.model.MovieUiModel

data class MovieState(
    val data: List<MovieUiModel>? = emptyList(),
    val error:String = "",
    val isLoading:Boolean = false
)
