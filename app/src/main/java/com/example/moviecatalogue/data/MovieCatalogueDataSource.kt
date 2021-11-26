package com.example.moviecatalogue.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import com.example.moviecatalogue.vo.Resource

interface MovieCatalogueDataSource {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getAllTvShows(): LiveData<Resource<PagedList<TvShowEntity>>>

    fun getAllMovieFavorite(): LiveData<PagedList<MovieEntity>>

    fun getAllTvShowFavorite(): LiveData<PagedList<TvShowEntity>>

    fun getMovieById(movieId: Int): LiveData<MovieEntity>

    fun getTvShowById(tvShowId: Int): LiveData<TvShowEntity>

    fun setMovieFavorite(movie: MovieEntity, state: Boolean)

    fun setTvShowFavorite(tvShow: TvShowEntity, state: Boolean)
}