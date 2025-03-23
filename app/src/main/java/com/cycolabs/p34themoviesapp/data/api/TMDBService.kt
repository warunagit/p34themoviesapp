package com.cycolabs.p34themoviesapp.data.api


import com.cycolabs.p34themoviesapp.data.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ):Response<MovieList>
}