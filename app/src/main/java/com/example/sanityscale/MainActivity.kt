package com.example.sanityscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureLogInButton();
    }

    fun configureLogInButton() {
        val logInButton = findViewById(R.id.logInBtn) as Button;
        logInButton.setOnClickListener(object:android.view.View.OnClickListener {

            override fun onClick(p0: android.view.View){
                val intent = android.content.Intent(this@MainActivity, LogInScreen::class.java)
                startActivity(intent);
            }
        });
    }



}
