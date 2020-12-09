package com.example.playground

import android.app.Application
import androidx.room.Room
import com.example.playground.data.db.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class BaseApp : Application(){
    override fun onCreate() {
        super.onCreate()
       startKoin {
           modules(listOf(roomModule))
       }
    }
}

val roomModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "my_room_db").allowMainThreadQueries().build()
    }
}