package com.project.hogwartapp.view.base

import androidx.recyclerview.widget.RecyclerView


abstract class BaseAdapter<VH: RecyclerView.ViewHolder, in D>:  RecyclerView.Adapter<VH>() {

    abstract fun setData(dataList: List<D>)
}