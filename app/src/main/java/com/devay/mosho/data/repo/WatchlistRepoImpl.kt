package com.devay.mosho.data.repo

import com.devay.mosho.data.local.Watchlist
import com.devay.mosho.data.local.WatchlistDAO
import kotlinx.coroutines.flow.Flow

class WatchlistRepoImpl(
    private val dao: WatchlistDAO
): WatchlistRepo {
    override suspend fun insert(watchlist: Watchlist) {
        dao.insert(watchlist)
    }

    override suspend fun delete(watchlist: Watchlist) {
        dao.delete(watchlist)
    }

    override suspend fun getById(id: Int, isMovie: Boolean): Watchlist? {
        return dao.getById(id, isMovie)
    }

    override fun getAll(isMovie: Boolean): Flow<List<Watchlist>> {
        return dao.getAll(isMovie)
    }
}