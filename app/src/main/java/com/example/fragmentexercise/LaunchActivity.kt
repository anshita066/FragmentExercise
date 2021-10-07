package com.example.fragmentexercise

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        // Get views reference
        val fragDemoBtn = findViewById<Button>(R.id.fragmentDemoBtn)
        val dialogFragmentBtn = findViewById<Button>(R.id.dFragmentDemoBtn)
        val preferenceFragmentBtn = findViewById<Button>(R.id.pFragmentDemobtn)

        // attach on click listeners
        fragDemoBtn.setOnClickListener {
            // send user to next activity
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}