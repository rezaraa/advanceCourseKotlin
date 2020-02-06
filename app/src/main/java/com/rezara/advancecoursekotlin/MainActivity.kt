package com.rezara.advancecoursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = arrayListOf( "Name" , "Family" , "Age" )
        var clickListener: (String)->Unit={
           when(it){
           "Name" -> Toast.makeText(this, "Reza", Toast.LENGTH_SHORT).show()
           "Family" -> Toast.makeText(this, "rabiei", Toast.LENGTH_SHORT).show()
           "Age" -> Toast.makeText(this, "23", Toast.LENGTH_SHORT).show()

           }
        }
        val adapter = Recycleradapter(list,clickListener)
        recycler.adapter = adapter


//    override fun onclick(name: String) {
//        when (name) {
//            "Name" -> Toast.makeText(this, "Reza", Toast.LENGTH_SHORT).show()
//            "Family" -> Toast.makeText(this, "rabiei", Toast.LENGTH_SHORT).show()
//            "Age" -> Toast.makeText(this, "23", Toast.LENGTH_SHORT).show()

        }
    }



