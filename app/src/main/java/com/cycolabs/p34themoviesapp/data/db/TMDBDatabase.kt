package com.cycolabs.p34themoviesapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cycolabs.p34themoviesapp.data.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase(){

    abstract fun movieDao(): MovieDao
}