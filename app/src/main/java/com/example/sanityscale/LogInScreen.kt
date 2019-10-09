package com.example.sanityscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LogInScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        configureBackButton()
        configureLogInButton()
    }

    fun configureBackButton() {
        val backButton = findViewById(R.id.backBtn) as Button;
        backButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@LogInScreen, MainActivity::class.java)
                startActivity(intent);
            }
        });
    }
    fun configureLogInButton() {
        val logInButton = findViewById(R.id.login) as Button;
        logInButton.setOnClickListener(object : android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View) {
                val intent = android.content.Intent(this@LogInScreen, homeScreen::class.java)
                startActivity(intent);
            }
        });
    }
}
