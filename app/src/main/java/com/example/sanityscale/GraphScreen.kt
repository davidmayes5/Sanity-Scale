package com.example.sanityscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GraphScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph_screen)

        configureSettingsButton()
    }

    fun configureSettingsButton() {
        val settingsButton = findViewById(R.id.settingsBtn) as Button;
        settingsButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@GraphScreen, SettingsScreen::class.java)
                startActivity(intent);
            }
        });
    }
}
