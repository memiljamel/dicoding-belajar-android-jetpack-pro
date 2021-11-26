package com.example.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse(
    var movieId: Int,
    var language: String,
    var title: String,
    var overview: String,
    var poster: String,
    var releaseDate: String,
    var voteAverage: Double
) : Parcelable