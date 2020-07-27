package com.example.questionnineactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<ItemVH>() {

    private var data = arrayListOf<ItemsData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ItemVH(view)
    }

    override fun getItemCount()= data.size

    override fun onBindViewHolder(holder: ItemVH, position: Int) {
        holder.bind(data[position])
    }

    fun update(data : ArrayList<ItemsData>){
        this.data = data
        notifyDataSetChanged()
    }

    fun delete(pos: Int) {
        if (pos > -1 && data.size > pos) {
            data.removeAt(pos)
            notifyItemRemoved(pos)
            notifyItemRangeChanged(pos, data.size)
        }
    }

    fun add(item: ItemsData) {
        data.add(1, item)
        notifyItemInserted(1)
    }

}