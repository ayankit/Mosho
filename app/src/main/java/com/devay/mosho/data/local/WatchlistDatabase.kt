package com.devay.mosho.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Watchlist::class], version = 1)
abstract class WatchlistDatabase: RoomDatabase() {
    abstract val dao: WatchlistDAO
}