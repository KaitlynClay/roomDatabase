package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aBtn = findViewById<Button>(R.id.addBtn)
        val cBtn = findViewById<Button>(R.id.colorBtn)
        val txt1 = findViewById<TextView>(R.id.textView)
        val thisView = findViewById<View>(R.id.mainLayout)

        var viewModel = ViewModelProvider(this).get(MAViewModel::class.java)

        txt1.text = viewModel.num.toString()

        aBtn.setOnClickListener {
            viewModel.addNum()
            txt1.text = viewModel.num.toString()
        }

        cBtn.setOnClickListener {
            viewModel.switchColor()
            thisView.setBackgroundColor(viewModel.pickColor)
        }

    }
}