package com.project.hogwartapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.hogwartapp.data.local.entity.CharactersItem
import com.project.hogwartapp.databinding.ItemCharacterBinding

class DetailHouseAdapter() : RecyclerView.Adapter<DetailHouseAdapter.DetailCharacterViewHolder>() {

    private var dataList = arrayListOf<CharactersItem>()

    private var listener: ((id: Int) -> Unit)? = null

    fun setOnItemClickListener(listener: (id: Int) -> Unit) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailCharacterViewHolder {
        val binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DetailCharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailCharacterViewHolder, position: Int) = holder.bind(dataList[position])

    override fun getItemCount(): Int = dataList.size

    fun setItem(item : List<CharactersItem>){
        dataList.addAll(item)
        notifyDataSetChanged()
    }

    inner class DetailCharacterViewHolder(binding : ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root){
        val binding = binding
        fun bind(item : CharactersItem){
            binding.item = item
            itemView.setOnClickListener {
//                listener?.invoke(item.audioGuideId)
            }
        }
    }
}