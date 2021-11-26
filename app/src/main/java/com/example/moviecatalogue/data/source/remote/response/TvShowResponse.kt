package com.example.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowResponse(
    var tvShowId: Int,
    var language: String,
    var name: String,
    var overview: String,
    var poster: String,
    var firstAirDate: String,
    var voteAverage: Double
) : Parcelable
