package com.example.moviecatalogue.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviecatalogue.R
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import com.example.moviecatalogue.databinding.ActivityDetailBinding
import com.example.moviecatalogue.databinding.DetailsItemContentBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "extra_catalogue_id"
        const val EXTRA_FILM = "extra_film"
    }

    private lateinit var activityDetailBinding: ActivityDetailBinding
    private lateinit var detailsItemContentBinding: DetailsItemContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailsItemContentBinding = activityDetailBinding.contentDetails
        setContentView(activityDetailBinding.root)

        setSupportActionBar(activityDetailBinding.toolbar)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        activityDetailBinding.progressBar.visibility = View.VISIBLE

        val extras = intent.extras
        if (extras != null) {
            when (extras.getString(EXTRA_FILM)) {
                "MOVIES" -> {
                    val movieId = extras.getInt(EXTRA_ID)
                    viewModel.setSelectedId(movieId)
                    viewModel.getMovie().observe(this, { movie ->
                        activityDetailBinding.progressBar.visibility = View.GONE
                        setFavoriteState(movie.isFavorite)
                        activityDetailBinding.fabFavorite.setOnClickListener {
                            viewModel.setMovieFavorite(movie)
                        }
                        populateMovie(movie)
                    })
                }
                "TV SHOWS" -> {
                    val tvShowId = extras.getInt(EXTRA_ID)
                    viewModel.setSelectedId(tvShowId)
                    viewModel.getTvShow().observe(this, { tvShow ->
                        activityDetailBinding.progressBar.visibility = View.GONE
                        setFavoriteState(tvShow.isFavorite)
                        activityDetailBinding.fabFavorite.setOnClickListener {
                            viewModel.setTvShowFavorite(tvShow)
                        }
                        populateTvShow(tvShow)
                    })
                }
            }
        }
    }

    private fun setFavoriteState(state: Boolean) {
        if (state) {
            activityDetailBinding.fabFavorite.setImageResource(R.drawable.ic_baseline_favorite_24)
        } else {
            activityDetailBinding.fabFavorite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/original${movieEntity.poster}")
            .apply(RequestOptions.placeholderOf(R.drawable.ic_custom_loading))
            .error(R.drawable.ic_custom_error)
            .into(detailsItemContentBinding.ivPoster)
        detailsItemContentBinding.tvVoteAverage.text = movieEntity.voteAverage.toString()
        detailsItemContentBinding.tvTitle.text = movieEntity.title
        detailsItemContentBinding.tvReleaseDate.text = movieEntity.releaseDate
        detailsItemContentBinding.tvLanguage.text = movieEntity.language
        detailsItemContentBinding.tvOverview.text = movieEntity.overview
    }

    private fun populateTvShow(tvShowEntity: TvShowEntity) {
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/original${tvShowEntity.poster}")
            .apply(RequestOptions.placeholderOf(R.drawable.ic_custom_loading))
            .error(R.drawable.ic_custom_error)
            .into(detailsItemContentBinding.ivPoster)
        detailsItemContentBinding.tvVoteAverage.text = tvShowEntity.voteAverage.toString()
        detailsItemContentBinding.tvTitle.text = tvShowEntity.name
        detailsItemContentBinding.tvReleaseDate.text = tvShowEntity.firstAirDate
        detailsItemContentBinding.tvLanguage.text = tvShowEntity.language
        detailsItemContentBinding.tvOverview.text = tvShowEntity.overview
    }
}