package com.example.movieapp.common.base

interface Mapper<F,T> {
    fun mapFrom(from:F):T

}