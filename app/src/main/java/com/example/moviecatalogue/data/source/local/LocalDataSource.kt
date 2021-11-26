package com.example.moviecatalogue.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import com.example.moviecatalogue.data.source.local.room.MovieCatalogueDao

class LocalDataSource private constructor(private val movieCatalogueDao: MovieCatalogueDao) {

    companion object {
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(movieCatalogueDao: MovieCatalogueDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(movieCatalogueDao)
    }

    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> = movieCatalogueDao.getAllMovies()

    fun getAllTvShows(): DataSource.Factory<Int, TvShowEntity> = movieCatalogueDao.getAllTvShows()

    fun getAllMovieFavorite(): DataSource.Factory<Int, MovieEntity> =
        movieCatalogueDao.getAllMoviesFavorite()

    fun getAllTvShowFavorite(): DataSource.Factory<Int, TvShowEntity> =
        movieCatalogueDao.getAllTvShowFavorite()

    fun insertMovies(movies: List<MovieEntity>) = movieCatalogueDao.insertMovies(movies)

    fun insertTvShows(tvShows: List<TvShowEntity>) = movieCatalogueDao.insertTvShows(tvShows)

    fun getMovieById(movieId: Int): LiveData<MovieEntity> = movieCatalogueDao.getMovieById(movieId)

    fun getTvShowById(tvShowId: Int): LiveData<TvShowEntity> =
        movieCatalogueDao.getTvShowById(tvShowId)

    fun setMovieFavorite(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        movieCatalogueDao.updateMovie(movie)
    }

    fun setTvShowFavorite(tvShow: TvShowEntity, newState: Boolean) {
        tvShow.isFavorite = newState
        movieCatalogueDao.updateTvShow(tvShow)
    }
}