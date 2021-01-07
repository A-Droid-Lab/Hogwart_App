package com.project.hogwartapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.project.hogwartapp.R
import com.project.hogwartapp.databinding.ItemHomeBinding

class HomeViewPagerAdapter : RecyclerView.Adapter<HomeViewPagerAdapter.HomeViewPagerViewHolder>(){

    private var houseNameList = arrayListOf("hogwart","Gryffindor","Hufflepuff","Ravenclaw","Slytherin")
    private var logoSrclist = arrayListOf(R.drawable.hogwart,R.drawable.grifindor, R.drawable.hufflepuff, R.drawable.ravenclaw, R.drawable.slytherin)

    private var listener: ((id: String) -> Unit)? = null

    fun setOnHouseClickListener(listener: (id: String) -> Unit) {
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeViewPagerAdapter.HomeViewPagerViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HomeViewPagerAdapter.HomeViewPagerViewHolder,
        position: Int
    )  = holder.bind(houseNameList[position], logoSrclist[position])

    override fun getItemCount(): Int = houseNameList.size

    inner class HomeViewPagerViewHolder(private val binding : ItemHomeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(houseName : String, imgSrc : Int){
            binding.item = houseName
            binding.ivHouseLogo.setImageResource(imgSrc)
            itemView.setOnClickListener {
                listener?.invoke(houseName)
            }
        }

    }
}