package com.azimzada.androidstudioderskotlinyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // !  Buradan baslayir

        var btn = findViewById<Button>(R.id.btnGoster)
        var goster = findViewById<TextView>(R.id.txtGoster)
        var adSoyad = findViewById<EditText>(R.id.AdSoyad)
        btn.setOnClickListener {
            goster.text = adSoyad.text
            adSoyad.text.clear()
        }
    }
}