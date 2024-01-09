package com.devay.mosho.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Watchlist(
    val title: String,
    val description: String?,
    val poster: String?,
    val backdrop: String?,
    val isMovie: Boolean,
    @PrimaryKey val id: Int
)
