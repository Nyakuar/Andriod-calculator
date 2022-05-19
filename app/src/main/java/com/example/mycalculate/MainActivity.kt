package com.example.mycalculate

import android.graphics.Insets.subtract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var btnadd: Button
    lateinit var btnsubtract: Button
    lateinit var btnmultiply: Button
    lateinit var btnmoulus: Button
    lateinit var tvanswer: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnmoulus = findViewById(R.id.btnmodulus)
        tvanswer = findViewById(R.id.tvanswer)
        et1 = findViewById(R.id.et1)
et2= findViewById(R.id.et2)
        tvanswer= findViewById(R.id.tvanswer)
        btnadd.setOnClickListener {
            var num1 = et1.text.toString().toInt()
            var num2 = et2.text.toString().toInt()
            add(num1,num2)

        }
        btnmultiply.setOnClickListener {
            var x = et1.text.toString().toInt()
            var y = et2.text.toString().toInt()
            multiply(x,y)
        }
        btnsubtract.setOnClickListener {
            var a = et1.text.toString().toInt()
            var b = et2.text.toString().toInt()
            subtract(a, b)
        }
        btnmoulus.setOnClickListener {
            var t=et1.toString().toInt()
            var e=et2.toString().toInt()
            modulus(t,e)
        }


    }

     fun modulus(t: Int, e: Int) {
         var modulus=t%e
         tvanswer.text=btnmoulus.toString()



     }

    fun multiply(x: Int, y: Int) {
        var add=x*y
        tvanswer.text=btnmultiply.toString()


    }

    fun add (num1: Int, num2: Int) {
         var add=num1+num2
         tvanswer.text=add.toString()


    }
    fun subtract(a: Int, b: Int) {
         var subtract=a-b




     }
}





