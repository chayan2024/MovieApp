package com.example.movieapp.features.movies.domain.repository


import com.example.movieapp.common.Result
import com.example.movieapp.data.model.Movies
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface MovieRepository {

    suspend fun getMovies():Flow<Result<Movies>>

}