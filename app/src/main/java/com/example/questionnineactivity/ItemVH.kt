package com.example.questionnineactivity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ItemVH (view: View) : RecyclerView.ViewHolder(view) {
   fun bind(item : ItemsData){
       itemView.txt_one.text = item.text_one
       itemView.txt_two.text = item.text_two
   }
}