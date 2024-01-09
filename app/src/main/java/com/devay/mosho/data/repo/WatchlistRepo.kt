package com.devay.mosho.data.repo

import com.devay.mosho.data.local.Watchlist
import kotlinx.coroutines.flow.Flow

interface WatchlistRepo {

    suspend fun insert(watchlist: Watchlist)

    suspend fun delete(watchlist: Watchlist)

    suspend fun getById(id: Int, isMovie: Boolean): Watchlist?

    fun getAll(isMovie: Boolean): Flow<List<Watchlist>>

}