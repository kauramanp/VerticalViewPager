package com.aman.verticalviewpager

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.aman.verticalviewpager.databinding.ItemAdapterBinding
import com.bumptech.glide.Glide

class ImageAdapter(
    private val activity: Activity,
    private val viewpagerObject: MutableList<ViewpagerObject>,
    private val itemClick: ItemClick
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
       var binding = ItemAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(activity, viewpagerObject[position], itemClick)
    }

    override fun getItemCount(): Int {
        return viewpagerObject.size
    }

   inner class ImageViewHolder(val binding: ItemAdapterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(activity: Activity,viewpagerObject: ViewpagerObject, itemClick: ItemClick) {
            Glide.with(activity).load(viewpagerObject.image).placeholder(R.drawable.ic_launcher_foreground).centerCrop().into(binding.backgroundView)
            binding.item = viewpagerObject
            binding.itemClick = itemClick
        }
    }
}