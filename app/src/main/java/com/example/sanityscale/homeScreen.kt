package com.example.sanityscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        configureWeeklyAvgButton()
        configureSettingsButton()
    }

    fun configureWeeklyAvgButton() {
        val weeklyAvgButton = findViewById(R.id.weeklyAvgBtn) as Button;
        weeklyAvgButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@homeScreen, GraphScreen::class.java)
                startActivity(intent);
            }
        });
    }
    fun configureSettingsButton() {
        val settingsButton = findViewById(R.id.settingsBtn) as Button;
        settingsButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@homeScreen, SettingsScreen::class.java)
                startActivity(intent);
            }
        });
    }
}
