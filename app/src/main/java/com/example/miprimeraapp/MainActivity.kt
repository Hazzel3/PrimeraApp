package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {

        var nombre:String=txtNombre.text.toString()

        Toast.makeText(applicationContext, "Hey, Hola $nombre " + ",bienvenido a mi Primera App :D", Toast.LENGTH_SHORT).show()
    }
}