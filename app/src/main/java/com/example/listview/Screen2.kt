package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        // Created on click event
        submit_button.setOnClickListener(View.OnClickListener {

            // Variables to fetch value
            val ETName = findViewById<EditText>(R.id.ET_Name)
            val ETPrice = findViewById<EditText>(R.id.ET_Price)
            val ETId = findViewById<EditText>(R.id.ET_Id)

            val intent = Intent(this@Screen2, MainActivity::class.java)

            //Passing those values using intent
            intent.putExtra("ETName", ETName.text.toString())
            intent.putExtra("ETPrice", ETPrice.text.toString())
            intent.putExtra("ETId", ETId.text.toString())

            // startActivity<MainActivity>()
            startActivity(intent)
        })
    }

}
