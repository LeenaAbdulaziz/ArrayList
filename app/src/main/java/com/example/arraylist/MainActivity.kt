package com.example.arraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var names:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        names= ArrayList()
        btnadd.setOnClickListener {

                names.add(edname.text.toString())
      edname.text.clear()
            Toast.makeText(applicationContext,"name is added",Toast.LENGTH_SHORT).show()


        }
        button.setOnClickListener {
            var n=ednum.text.toString().toInt()
            textView.text="${names[--n]}"

        }
    }
}