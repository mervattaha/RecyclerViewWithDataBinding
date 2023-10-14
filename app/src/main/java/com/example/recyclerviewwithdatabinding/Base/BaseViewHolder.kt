package com.example.recyclerviewwithdatabinding.Base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder<BINDING : ViewDataBinding>(val bindr : BINDING)
    : RecyclerView.ViewHolder(bindr.root) {


}