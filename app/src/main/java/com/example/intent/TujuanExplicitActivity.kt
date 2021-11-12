package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TujuanExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tujuan_explicit)

        val tvText = findViewById<TextView>(R.id.textView)
        tvText.text = intent.getStringExtra(EXTRA_TEXT)

    }

    companion object {
        const val EXTRA_TEXT = "extra_text"
    }

}