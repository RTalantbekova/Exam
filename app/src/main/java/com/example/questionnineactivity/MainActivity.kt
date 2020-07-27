package com.example.questionnineactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var btn_Add : Button? = null
    private var btn_Del : Button? = null
    private var recycleView : RecyclerView? = null
    val adapter = RecyclerAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setupRecyclerView()
    }

    private fun initViews(){
        btn_Add = findViewById(R.id.btnAdd)
        btn_Del = findViewById(R.id.btnDelete)
        recycleView = findViewById(R.id.recycler)
    }

    private fun setupRecyclerView(){
        recycleView?.adapter = adapter
        adapter.update(showData())
    }

    private fun showData(): ArrayList<ItemsData> {
        val list = arrayListOf<ItemsData>()

        for (i in 1..20){
            list.add(ItemsData("First Text $i", "Second Text $i"))
        }
        return list
    }

}