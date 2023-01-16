package com.kotlin.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.login)

        val logBTN = findViewById<Button>(R.id.LOGINbtn)
        val usernam =findViewById<EditText>(R.id.nameEdit)
        val pass = findViewById<EditText>(R.id.Passtext)

        logBTN.setOnClickListener{
            val name = usernam.text.toString()
            if (name=="Jumana" && pass.length()==5) {
                val intent = Intent(applicationContext, homepage::class.java)
                intent.putExtra("msg", name)
                startActivity(intent)
            }else
                    Toast.makeText(this, "wrong name! or pass", Toast.LENGTH_SHORT).show()

            }
        }




    }
