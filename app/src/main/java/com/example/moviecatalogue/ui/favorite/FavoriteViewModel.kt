package com.example.moviecatalogue.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecatalogue.data.MovieCatalogueRepository
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity

class FavoriteViewModel(private val movieCatalogueRepository: MovieCatalogueRepository) : ViewModel() {

    fun getMovieFavorite(): LiveData<PagedList<MovieEntity>> = movieCatalogueRepository.getAllMovieFavorite()

    fun getTvShowFavorite(): LiveData<PagedList<TvShowEntity>> = movieCatalogueRepository.getAllTvShowFavorite()
}