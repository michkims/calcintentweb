package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonintent:Button
    lateinit var ButtonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_Calc)
        Buttonintent=findViewById(R.id.Btn_Intent)
        ButtonWeb=findViewById(R.id.Btn_Web)
        Buttoncalc.setOnClickListener {
            val intent=Intent(this,calculatorActivity::class.java)
            startActivity(intent)
        }
        Buttonintent.setOnClickListener {
          val intent=Intent(this,intentActivity::class.java)
          startActivity(intent)
        }
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}
