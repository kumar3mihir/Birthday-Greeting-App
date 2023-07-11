package com.example.birthdaygreet

import android.content.Intent
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var nameInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assuming you have an EditText with the id "nameInput" in your layout file
        nameInput = findViewById(R.id.nameInput)

        // Call the createBirthdayCard() function
        val createCardButton: Button = findViewById(R.id.createCard)
        createCardButton.setOnClickListener{
            createBirthdayCard()
        }

    }

    private fun createBirthdayCard() {
            val name = nameInput.editableText.toString()
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
        //intent used for redirecting to us into new activity
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}


