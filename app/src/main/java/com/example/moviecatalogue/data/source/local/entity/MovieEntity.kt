package com.example.moviecatalogue.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "movieentities")
data class MovieEntity(

    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "movieId")
    var movieId: Int,

    @ColumnInfo(name = "language")
    var language: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "overview")
    var overview: String,

    @ColumnInfo(name = "poster")
    var poster: String,

    @ColumnInfo(name = "releaseDate")
    var releaseDate: String,

    @ColumnInfo(name = "voteAverage")
    var voteAverage: Double,

    @NotNull
    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = false
)
