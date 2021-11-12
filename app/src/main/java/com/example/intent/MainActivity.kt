package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitIntent = findViewById<Button>(R.id.button_explicit)
        val implicitIntent = findViewById<Button>(R.id.button_implicit)

        explicitIntent.setOnClickListener {
            val intent = Intent(this@MainActivity, TujuanExplicitActivity::class.java)
            intent.putExtra(TujuanExplicitActivity.EXTRA_TEXT, "Aku Data Kiriman")
            startActivity(intent)
        }

        implicitIntent.setOnClickListener {
            val phoneNumber = "081234567890"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

    }
}