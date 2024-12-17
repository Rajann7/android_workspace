package com.example.pizzaapp

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btn1 = findViewById(R.id.btnlogin)

        btn1.setOnClickListener {
            val name = edit1.text.toString()
            val pass = edit2.text.toString()

            when {
                name.isEmpty() && pass.isEmpty() -> {
                    edit1.error = "Please Enter Username"
                    edit2.error = "Please Enter Password"
                }
                name.isEmpty() -> {
                    edit1.error = "Please Enter Username"
                }
                pass.isEmpty() -> {
                    edit2.error = "Please Enter Password"
                }
                name == "Rajan" && pass == "007" -> {
                    Toast.makeText(applicationContext, "Successful Login", Toast.LENGTH_SHORT).show()

                    // Navigate to MainActivity (work us when go home scren press back when direct exit)
                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)

                    //this for intent simple
                    //val intent = Intent(this, MainActivity::class.java)
                    //                    startActivity(intent)
                    //                    finish() // Close LoginActivity so it doesn't remain in the back stack
                }
                else -> {
                    Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        // Show confirmation dialog before exiting
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Are you sure you want to exit?")
        alert.setPositiveButton("YES") { dialogInterface: DialogInterface, i: Int ->
            finishAffinity() // Close all activities and exit
        }
        alert.setNegativeButton("NO") { dialogInterface: DialogInterface, i: Int ->
            dialogInterface.cancel() // Cancel the dialog and stay in the activity
        }
        alert.show()
    }
}
