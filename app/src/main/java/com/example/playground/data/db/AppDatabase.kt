package com.example.playground.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.playground.data.dao.UserDao
import com.example.playground.data.entity.User

@Database(entities = [User::class],version = 1)
abstract class  AppDatabase:RoomDatabase(){
    abstract fun userDao() : UserDao

}