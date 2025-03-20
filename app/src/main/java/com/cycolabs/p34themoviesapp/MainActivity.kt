package com.cycolabs.p34themoviesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

    //1-Add dependencies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}