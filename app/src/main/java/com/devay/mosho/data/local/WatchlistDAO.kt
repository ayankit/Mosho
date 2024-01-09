package com.devay.mosho.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WatchlistDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(watchlist: Watchlist)

    @Delete
    suspend fun delete(watchlist: Watchlist)

    @Query("SELECT * FROM watchlist WHERE id == :id AND isMovie == :isMovie")
    suspend fun getById(id: Int, isMovie: Boolean): Watchlist?

    @Query("SELECT * FROM watchlist WHERE isMovie == :isMovie")
    fun getAll(isMovie: Boolean): Flow<List<Watchlist>>
}