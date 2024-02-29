package com.example.roomdatabase

import android.graphics.Color
import androidx.lifecycle.ViewModel

class MAViewModel: ViewModel() {

    var num = 0

    fun addNum() {
        num++
    }

    var pickColor = Color.WHITE

    fun switchColor() {
        pickColor = Color.GRAY
    }

}