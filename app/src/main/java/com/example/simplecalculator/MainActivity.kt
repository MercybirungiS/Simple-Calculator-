package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnModulus = findViewById<Button>(R.id.btnModulus)
        val etFirstNumber = findViewById<EditText>(R.id.etNum1)
        val etSecondNumber = findViewById<EditText>(R.id.etNum2)
        val tvResult=findViewById<TextView>(R.id.tvResults)

        btnAdd.setOnClickListener {

            if (etFirstNumber.text.toString().equals("") || etSecondNumber.text.toString().equals("")) {


                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            }
            else {
                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val num3 = num1 + num2
                tvResult.text = ("Result $num3")


            }
           }



        btnSubtract.setOnClickListener {

            if (etFirstNumber.text.toString().equals("") || etSecondNumber.text.toString()
                    .equals("")
            ) {


                Toast.makeText(baseContext, "Put Number", Toast.LENGTH_LONG).show()
            } else {
                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val num3 = num1 - num2
                tvResult.text = ("Result $num3")

              }
            }

            btnMultiply.setOnClickListener {

                if (etFirstNumber.text.toString().equals("") || etSecondNumber.text.toString()
                        .equals("")
                ) {


                    Toast.makeText(baseContext, "Put Number", Toast.LENGTH_LONG).show()
                } else {
                    val num1 = etFirstNumber.text.toString().toInt()
                    val num2 = etSecondNumber.text.toString().toInt()
                    val num3 = num1 * num2
                    tvResult.text = ("Result $num3")

                }
            }
                btnModulus.setOnClickListener {
//
                    if (etFirstNumber.text.toString().equals("") || etSecondNumber.text.toString()
                            .equals("")
                    ) {


                        Toast.makeText(baseContext, "Put Number", Toast.LENGTH_LONG).show()
                    } else {
                        val num1 = etFirstNumber.text.toString().toInt()
                        val num2 = etSecondNumber.text.toString().toInt()
                        val num3 = num1 % num2
                        tvResult.text = ("Result $num3")


                    }
                }
            }
        }
