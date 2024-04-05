package com.example.movieapp.features.movies.domain.mapper

import com.example.movieapp.common.base.Mapper
import com.example.movieapp.data.model.Movies
import com.example.movieapp.features.movies.domain.model.MovieUiModel
import javax.inject.Inject

class MovieMapper @Inject constructor() : Mapper<Movies?, List<MovieUiModel>?> {

    override fun mapFrom(from: Movies?): List<MovieUiModel>? {
        return from?.results?.map {
            MovieUiModel(
               Movies.Results(
                   id = it?.id,
                   original_title = it?.original_title,
                   overview = it?.overview,
                   poster_path = it?.poster_path,
                   vote_average = it?.vote_average
               )
            )
        }
    }
}