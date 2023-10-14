package com.example.recyclerviewwithdatabinding.scene.main

import com.example.recyclerviewwithdatabinding.Base.BaseAdapter
import com.example.recyclerviewwithdatabinding.R
import com.example.recyclerviewwithdatabinding.data.movie.Movie
import com.example.recyclerviewwithdatabinding.databinding.ItemMovieBinding

class MovieAdapter(
    private val list: List<Movie>,
    private val movieListener: MovieListener
) : BaseAdapter<ItemMovieBinding, Movie>(list) {

    override val layoutId: Int = R.layout.item_movie

    override fun bind(binding: ItemMovieBinding, item: Movie) {
        binding.apply {
            movie = item
            listener = movieListener
            executePendingBindings()
        }
    }
}

interface MovieListener {
    fun onMovieClicked(movie: Movie)
    fun onFavouriteClicked(movie: Movie)
}