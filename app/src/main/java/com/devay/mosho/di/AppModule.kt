package com.devay.mosho.di

import android.app.Application
import androidx.room.Room
import com.devay.mosho.data.local.WatchlistDatabase
import com.devay.mosho.data.repo.WatchlistRepoImpl
import com.devay.mosho.data.repo.WatchlistRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWatchlistDB(app: Application): WatchlistDatabase {
        return Room.databaseBuilder(
            app,
            WatchlistDatabase::class.java,
            "watchlist_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideWatchlistRepo(db: WatchlistDatabase): WatchlistRepo {
        return WatchlistRepoImpl(db.dao)
    }


}