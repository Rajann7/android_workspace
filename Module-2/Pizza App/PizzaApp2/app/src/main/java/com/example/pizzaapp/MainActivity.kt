package com.example.pizzaapp


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html.ImageGetter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 : Button = findViewById(R.id.btn1)
        btn1.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:8758771806"))
            startActivity(intent)
        }

        val img1: ImageView = findViewById(R.id.img01)
        img1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }




        val txt1 : TextView = findViewById(R.id.txt1)

        txt1.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img2: ImageView = findViewById(R.id.img02)
        img2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


        val txt2 : TextView = findViewById(R.id.txt2)

        txt2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img3: ImageView = findViewById(R.id.img03)
        img3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }


        val txt3 : TextView = findViewById(R.id.txt3)

        txt3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }


        val img4: ImageView = findViewById(R.id.img04)
        img4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        val txt4 : TextView = findViewById(R.id.txt4)

        txt4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }
        val img5: ImageView = findViewById(R.id.img05)
        img5.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }


        val txt5 : TextView = findViewById(R.id.txt5)

        txt5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img6: ImageView = findViewById(R.id.img06)
        img6.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }


        val txt6 : TextView = findViewById(R.id.txt6)

        txt6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img7: ImageView = findViewById(R.id.img07)
        img7.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }


        val txt7 : TextView = findViewById(R.id.txt7)

        txt7.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img8: ImageView = findViewById(R.id.img08)
        img8.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        val txt8 : TextView = findViewById(R.id.txt8)

        txt8.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }
        val img9: ImageView = findViewById(R.id.img09)
        img9.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        val txt9 : TextView = findViewById(R.id.txt9)

        txt9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        val img10: ImageView = findViewById(R.id.img10)
        img10.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }


        val txt10 : TextView = findViewById(R.id.txt10)

        txt10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/menu/veg-pizzas"))
            startActivity(intent)

        }

        }


    }

