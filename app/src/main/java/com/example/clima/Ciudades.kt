package com.example.clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.clima.ciudades.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        //val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)

        //asignacion de Listener
        button2.setOnClickListener(View.OnClickListener {
            //    Spain
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"2510769")
            startActivity(intent)
        })
        button3.setOnClickListener(View.OnClickListener {
            //   China
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"1814991")
            startActivity(intent)
        })
        button4.setOnClickListener(View.OnClickListener {
            //  Italy
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"298795")
            startActivity(intent)
        })
        button5.setOnClickListener(View.OnClickListener {
            //   Turkey
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"298795")
            startActivity(intent)
        })
        button6.setOnClickListener(View.OnClickListener {
            //    Germany
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"2921044")
            startActivity(intent)
        })
        button7.setOnClickListener(View.OnClickListener {
            //    Mexico
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"3530597")
            startActivity(intent)
        })
    }
}
