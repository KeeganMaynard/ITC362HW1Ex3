package com.keegan.android.itc362hw1ex3

import com.keegan.android.itc362hw1ex3.MyHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var increment : Button
    private lateinit var amount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amount = findViewById(R.id.display_number)
        increment = findViewById(R.id.increment)

        increment.setOnClickListener {
            var stringValue = amount.text.toString()
            var originalValue = stringValue.toInt()
            var newValue = MyHelper.addTo(originalValue)
            amount.setText(newValue.toString())
        }
    }
}