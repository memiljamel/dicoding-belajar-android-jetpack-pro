package com.example.moviecatalogue.utils

import android.content.Context
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(filaName: String): String? {
        return try {
            val `is` = context.assets.open(filaName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val movieList = ArrayList<MovieResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("movie.json").toString())
            val movies = responseObject.getJSONArray("movies")

            for (i in 0 until movies.length()) {
                val movie = movies.getJSONObject(i)
                val movieId = movie.getInt("id")
                val language = movie.getString("language")
                val title = movie.getString("title")
                val overview = movie.getString("overview")
                val poster = movie.getString("poster")
                val releaseDate = movie.getString("release_date")
                val voteAverage = movie.getDouble("vote_average")

                val movieResponse = MovieResponse(
                    movieId,
                    language,
                    title,
                    overview,
                    poster,
                    releaseDate,
                    voteAverage
                )
                movieList.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return movieList
    }

    fun loadTvShows(): List<TvShowResponse> {
        val tvShowList = ArrayList<TvShowResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("tv_show.json").toString())
            val tvShows = responseObject.getJSONArray("tv_shows")

            for (i in 0 until tvShows.length()) {
                val tvShow = tvShows.getJSONObject(i)
                val tvShowId = tvShow.getInt("id")
                val language = tvShow.getString("language")
                val name = tvShow.getString("name")
                val overview = tvShow.getString("overview")
                val poster = tvShow.getString("poster")
                val firstAirDate = tvShow.getString("first_air_date")
                val voteAverage = tvShow.getDouble("vote_average")

                val tvShowResponse = TvShowResponse(
                    tvShowId,
                    language,
                    name,
                    overview,
                    poster,
                    firstAirDate,
                    voteAverage
                )
                tvShowList.add(tvShowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return tvShowList
    }
}