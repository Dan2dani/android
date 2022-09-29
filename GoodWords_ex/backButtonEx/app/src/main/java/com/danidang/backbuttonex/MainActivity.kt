package com.danidang.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed(){
        Log.d("MainActivity", "backbutton")
        if (isDouble == true){
            finish()
        }

        isDouble = true
        Toast.makeText(this, "종료하시려면 더블 클릭", Toast.LENGTH_LONG).show()

        Handler().postDelayed({
            isDouble = false }
            , 2000)
    }



}