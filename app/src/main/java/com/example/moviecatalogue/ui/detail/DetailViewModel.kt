package com.example.moviecatalogue.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.data.MovieCatalogueRepository
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import kotlin.properties.Delegates

class DetailViewModel(private val movieCatalogueRepository: MovieCatalogueRepository) :
    ViewModel() {
    private var id by Delegates.notNull<Int>()

    fun setSelectedId(id: Int) {
        this.id = id
    }

    fun getMovie(): LiveData<MovieEntity> = movieCatalogueRepository.getMovieById(id)

    fun getTvShow(): LiveData<TvShowEntity> = movieCatalogueRepository.getTvShowById(id)

    fun setMovieFavorite(movie: MovieEntity) {
        val newState = !movie.isFavorite
        movieCatalogueRepository.setMovieFavorite(movie, newState)
    }

    fun setTvShowFavorite(tvShow: TvShowEntity) {
        val newState = !tvShow.isFavorite
        movieCatalogueRepository.setTvShowFavorite(tvShow, newState)
    }
}