package com.danidang.bts_image_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 출력되었다는 것을 프로그램이 알아야 한다.
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image2.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTS6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (화면전환)
            val intent = Intent(this, BTSActivity7::class.java)
            startActivity(intent)
        }
    }
}