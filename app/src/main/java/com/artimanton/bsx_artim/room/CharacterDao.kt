package com.artimanton.wiki.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.artimanton.bsx_artim.model.Posts


@Dao
interface CharacterDao {
    @get:Query("SELECT * FROM posts")
    val all: List<Any?>?

    @Query("SELECT * FROM posts WHERE id = :id")
    fun getById(id: Long): Posts?

    @Insert
    fun insert(character: Posts?)

    @Update
    fun update(character: Posts?)

    @Delete
    fun delete(character: Posts?)

    @Query("SELECT * FROM posts ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<Posts>>?
}