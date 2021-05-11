package com.famous.affirmative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.famous.affirmative.adapter.ItemAdapter
import com.famous.affirmative.data.loadAffirmations
import javax.sql.DataSource as DataSource1

class MainActivity : AppCompatActivity() {
//    private lateinit var binding =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val myDataSet = loadAffirmations()
    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.adapter = ItemAdapter(myDataSet, this)
    recyclerView.setHasFixedSize(true)

    }
}