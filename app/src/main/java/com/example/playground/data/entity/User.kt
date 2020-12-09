package com.example.playground.data.entity

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "users",
    indices = [
    Index(
        value = ["id"],
        unique = true)])
 data class User (
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null,

    @ColumnInfo(name = "fullname")
    var fullname : String? = null,

    @ColumnInfo
    var email: String? = null,

    @ColumnInfo(name = "bio")
    var shortBio : String? = ""


)


