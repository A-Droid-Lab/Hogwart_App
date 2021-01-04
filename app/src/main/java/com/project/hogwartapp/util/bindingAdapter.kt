package com.project.hogwartapp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.project.hogwartapp.R

@BindingAdapter("loadImage")
fun setImageUrl(view : ImageView, url : String?){
    if(!url.isNullOrEmpty()){
        Glide.with(view.context)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .centerCrop()
            .into(view)
    }
}