package com.cmps312.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
=======
import kotlinx.android.synthetic.main.activity_main.*

>>>>>>> 4abea7f593a9269ecd5b294dfdd39a3758933962

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
=======

        showBtn.setOnClickListener {
            var name = nameEdt.text.toString();

            displayTv.text = "Welcome to cmps 312 Mr. $name"
        }
>>>>>>> 4abea7f593a9269ecd5b294dfdd39a3758933962
    }
}