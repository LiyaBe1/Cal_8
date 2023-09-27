package com.example.cal_8

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OnClick(view: View){
        var b1:Button? = null
        if (view is Button){
            b1 = view as Button
        }
        val textView: TextView = findViewById(R.id.textView)

        when(b1?.text){
            "0" -> b1.visibility = View.INVISIBLE
            "1" -> b1.visibility = View.VISIBLE
            "2" -> b1.visibility = View.VISIBLE
            "3" -> b1.visibility = View.VISIBLE
            "4" -> b1.visibility = View.VISIBLE
            "5" -> b1.visibility = View.VISIBLE
            "6" -> b1.visibility = View.VISIBLE
            "7" -> b1.visibility = View.VISIBLE
            "8" -> b1.visibility = View.VISIBLE
            "9" -> b1.visibility = View.VISIBLE

        }
        "0" -> {
            if (textView.text =="0"){
                textView.text = "0.0"
                var decimal = true
            }
            else textView.text = textView.text.toString() + "0"
        }


    }
}