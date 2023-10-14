package com.example.recyclerviewwithdatabinding.data.movie

import androidx.annotation.DrawableRes
import com.example.recyclerviewwithdatabinding.Base.ListAdapterItem
import java.io.Serializable

data class Movie(
    val name: String,
    val date: String,
    val rating: String,
    @DrawableRes val image: Int,
    var favourite: Boolean = false,
    override val id: Long = 0
) : ListAdapterItem, Serializable