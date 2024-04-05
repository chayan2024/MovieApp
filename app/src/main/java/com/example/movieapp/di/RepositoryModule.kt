package com.example.movieapp.di

import com.example.movieapp.data.repository.MovieRepositoryImp
import com.example.movieapp.features.movies.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun providesMovieRepository(
        movieRepositoryImp: MovieRepositoryImp
    ): MovieRepository


}