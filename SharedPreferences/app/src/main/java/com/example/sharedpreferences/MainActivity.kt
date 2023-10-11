package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var pick_class: EditText
    lateinit var pick_num: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.edit1)
        pick_class = findViewById(R.id.edit2)
        pick_num = findViewById(R.id.edit3)
    }

    override fun onResume() {
        super.onResume()

        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val key1 = SP.getString("name","1")
        val key2 = SP.getString("pick_class","1")
        val key3 = SP.getInt("pick_num", 0)

        name!!.setText(key1)
        pick_class!!.setText(key2)
        pick_num!!.setText(key3.toString())



    }

    override fun onPause() {
        super.onPause()
        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val myEdit = SP.edit()
        myEdit.putString("name", name!!.text.toString())
        myEdit.putString("pick_class", pick_class!!.text.toString())
        myEdit.putInt("pick_num", pick_num!!.text.toString().toInt())

        myEdit.apply()

    }

}