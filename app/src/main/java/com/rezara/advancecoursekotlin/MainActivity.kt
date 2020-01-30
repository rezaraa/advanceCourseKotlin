package com.rezara.advancecoursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,Interface{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = arrayListOf( "Name" , "Family" , "Age" )

        val adapter = Recycleradapter(list, this)
        recycler.adapter = adapter

    }

    override fun onclick(name: String) {
        when (name) {
            "Name" -> Toast.makeText(this, "Reza", Toast.LENGTH_SHORT).show()
            "Family" -> Toast.makeText(this, "rabiei", Toast.LENGTH_SHORT).show()
            "Age" -> Toast.makeText(this, "23", Toast.LENGTH_SHORT).show()

        }
    }



}
