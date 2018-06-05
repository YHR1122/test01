package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class test01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test01)

        var flag = true
        val button = findViewById<Button>(R.id.button) as Button
        val textView = findViewById<TextView>(R.id.textview) as TextView

        button.setOnClickListener {
            if (flag) {
                // flagがtrueの時
                textView.setText("Hello World")
                flag = false
            } else {
                // flagがfalseの時
                textView.setText("")
                flag = true
            }
        }

    }
}
