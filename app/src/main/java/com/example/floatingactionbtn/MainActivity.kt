package com.example.floatingactionbtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        //戻るボタンの表示
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // recyclerView
        val list = List<String>(20) { "RecyclerView$it" }
        val adapter = RecyclerViewAdapter(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    // オプションメニューを表示させる
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = MenuInflater(this)
        inflater.inflate(R.menu.main, menu)
        return true
    }
}
