package com.cycolabs.p34themoviesapp.data

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity(tableName = "popular_movies")
data class Movie(
    @SerializedName("id")
    val Movieid: Int,

    @SerializedName("overview")
    val overview:String,

    @SerializedName("poster_path")
    val poster_path: String,

    @SerializedName("release_date")
    val release_date: String,

    @SerializedName("title")
    val title: String)
