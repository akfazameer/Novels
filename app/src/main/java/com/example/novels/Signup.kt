

package com.example.novels

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.CheckBox
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.form)

        val user: TextInputLayout = findViewById(R.id.userinputlayout)
        val pass: TextInputLayout = findViewById(R.id.passwordinputlayout)
        val switch1: Switch = findViewById(R.id.switch1)
        val terms: CheckBox = findViewById(R.id.checkbox)

        val submit: Button = findViewById(R.id.submit)


        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Latest Novels Subscribed", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Not Unsubscribed", Toast.LENGTH_SHORT).show()
            }
        }

        // Terms checkbox listener
        terms.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "You agreed with terms", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Not agreed with terms", Toast.LENGTH_SHORT).show()
            }
        }



        // Submit button click listener
        submit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
