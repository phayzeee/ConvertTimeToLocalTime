package com.example.converttimetolocaltime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var convertBtn: Button
    lateinit var etTime: EditText
    lateinit var tvTime: TextView
    var timeString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    fun initUI() {
        convertBtn = findViewById(R.id.btn_convert)
        etTime = findViewById(R.id.et_time)
        tvTime = findViewById(R.id.tv_time)
        timeString = etTime.text.toString()

        convertBtn.setOnClickListener {
            tvTime.setText(Utilities.returnTimeAgo(timeString))
        }
    }
}