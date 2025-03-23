package com.cycolabs.p34themoviesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //app uder layers
    //
    //|-Data-|-Repository [Local data source Entity, SQLite<->DAO]
    //|      |-Remote Data Source (Web Service <-> API)
    //|-UseCase (Domain)
    //|-[View-Model[Live-Data[Model]]]
    //|-View (Activity/Fragment)
    //When getting app big, there will be more ViewModels
    //Somethings will located in different VM classes
    //To avoid this complexity,
    // can create various UseCase classes to reduce code duplication
    // and complication.
    //Presentation - Interact with user - Activity, Fragment, ViewModel
    //Use Case - layer where define user's works
    //Domain - layer where logic operations performed.
    //Eg: entities, value objects, exceptions, logic operations
    //Data - Source of all abstract data and models.
    //Framework - Layer that interacts with SDK and provides custom implementations for data layer

    //Top 5 movies are dynamics.
    //should allow user to refresh and receive updated data from API
    //Contains 3 categories, Movies, TV Shows, Artists
    //For 3 categories, need 6 use cases. 3 for receiving and 3 for update data

    //JSON -> Retrofit -> POJO -> Room DB, App UI
    //TheMovieDB.org - warunarjg,Temp1234#
    //API Read Access Token
    //eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OGRlNjliYmM4ZTg3Mjk1ZjUyYmIyMDkwZDQ3OGQyNyIsIm5iZiI6MTc0MjQ4MjE2MS44MDYwMDAyLCJzdWIiOiI2N2RjMmFmMTA4NzQ5ZWZlMzRlN2IzMzEiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.U3gHpeZwObSYgJ9ZF5SwncceylDs9dupQDEJtJn0OCw
    //API Key
    //48de69bbc8e87295f52bb2090d478d27
    //popular-https://api.themoviedb.org/3/movie/popular?api_key=48de69bbc8e87295f52bb2090d478d27

    //1-Add dependencies
    //2-Ceeate data class: Movie, MovieList
    //3-add JSONToKotlinClass plugin from market place
    //4-create new class, copy paste json data, then generate: Kotlin data class from JSON
    //it will create class: Result, regarding to the JSON data with contain properties
    //5-create package: api
    //6-creat api interface for search: TMDBService
    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}