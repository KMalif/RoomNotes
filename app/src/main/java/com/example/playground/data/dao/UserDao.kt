package com.example.playground.data.dao

import androidx.room.*
import com.example.playground.data.entity.User

@Dao
interface UserDao {
    @Query(value = "SELECT * FROM users")
    fun alluser() : List<User>

    @Query(value = "SELECT * FROM users WHERE id = :id LIMIT 1")
    fun find(id : Int) : User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user:User)
}