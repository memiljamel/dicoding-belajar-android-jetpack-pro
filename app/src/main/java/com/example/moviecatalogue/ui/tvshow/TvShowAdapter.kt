package com.example.moviecatalogue.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviecatalogue.R
import com.example.moviecatalogue.data.source.local.entity.TvShowEntity
import com.example.moviecatalogue.databinding.ListItemTvShowBinding
import com.example.moviecatalogue.ui.detail.DetailActivity

class TvShowAdapter : PagedListAdapter<TvShowEntity, TvShowAdapter.ListViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TvShowEntity>() {
            override fun areItemsTheSame(oldItem: TvShowEntity, newItem: TvShowEntity): Boolean {
                return oldItem.tvShowId == newItem.tvShowId
            }

            override fun areContentsTheSame(oldItem: TvShowEntity, newItem: TvShowEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val listItemTvShowBinding =
            ListItemTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(listItemTvShowBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tvshow = getItem(position)
        if (tvshow != null) {
            holder.bind(tvshow)
        }
    }

    inner class ListViewHolder(private val listItemTvShowBinding: ListItemTvShowBinding) :
        RecyclerView.ViewHolder(listItemTvShowBinding.root) {
        fun bind(tvShows: TvShowEntity) {
            with(listItemTvShowBinding) {
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_ID, tvShows.tvShowId)
                    intent.putExtra(DetailActivity.EXTRA_FILM, "TV SHOWS")
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load("https://image.tmdb.org/t/p/original${tvShows.poster}")
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_custom_loading))
                    .error(R.drawable.ic_custom_error)
                    .into(ivPoster)
                tvTitle.text = tvShows.name
                tvOverview.text = tvShows.overview
            }
        }
    }
}