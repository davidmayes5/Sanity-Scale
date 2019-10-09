package com.example.sanityscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsScreen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_screen2)

        configureBackButton()
    }

    fun configureBackButton() {
        val backButton = findViewById(R.id.backBtn) as Button;
        backButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@SettingsScreen2, GraphScreen::class.java)
                startActivity(intent);
            }
        });
    }
}
