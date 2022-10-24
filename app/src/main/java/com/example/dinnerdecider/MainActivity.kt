package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var foodList = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Mongolian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickAdd(view: View) {
        if(!foodList.contains(foodNameTxt.text.toString())) {
            foodList.add(foodNameTxt.text.toString())
        }
    }

    fun clickDecide(view: View) {
        val idx = Random.nextInt(foodList.size)
        val food = foodList[idx]

        msg.text = food
    }
}