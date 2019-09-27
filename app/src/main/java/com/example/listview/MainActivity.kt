package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ETName = intent.getStringExtra("ETName")
        var ETPrice = intent.getStringExtra("ETPrice")
        var ETId = intent.getStringExtra("ETId")

        if(ETName != null && ETPrice != null && ETId != null ){
            Log.d("Data", data.toString())
            data.add(MainModel(ETId, ETName, ETPrice))
        } else {
            data.add(MainModel("1","Name 1","Price 1"))
            data.add(MainModel("2","Name 2","Price 2"))
            data.add(MainModel("3","Name 3","Price 3"))
            Log.d("Error", "Error")
        }

        add_button.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, Screen2::class.java)

            startActivityForResult(intent,0)
        })

        recycler_view.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        recycler_view.adapter = NameAdapter(this@MainActivity, data)
    }
}
