package com.abramov.appforuniversity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClickSum(v: View) {
        val firstNum: EditText = findViewById(R.id.firstNum)
        val secondNum: EditText = findViewById(R.id.secondNum)
        val result: TextView = findViewById(R.id.result)
        val num1: Int
        val num2: Int
        val res: Int
        num1 = Integer.parseInt(firstNum.text.toString())
        num2 = Integer.parseInt(secondNum.text.toString())
        res = num1 + num2
        result.setText(res.toString())
    }

    fun onButtonClickSub(v: View) {
        val firstNum: EditText = findViewById(R.id.firstNum)
        val secondNum: EditText = findViewById(R.id.secondNum)
        val result: TextView = findViewById(R.id.result)
        val num1: Int
        val num2: Int
        val res: Int
        num1 = Integer.parseInt(firstNum.text.toString())
        num2 = Integer.parseInt(secondNum.text.toString())
        res = num1 - num2
        result.setText(res.toString())
    }

    fun onButtonClickMul(v: View) {
        val firstNum: EditText = findViewById(R.id.firstNum)
        val secondNum: EditText = findViewById(R.id.secondNum)
        val result: TextView = findViewById(R.id.result)
        val num1: Int
        val num2: Int
        val res: Int
        num1 = Integer.parseInt(firstNum.text.toString())
        num2 = Integer.parseInt(secondNum.text.toString())
        res = num1 * num2
        result.setText(res.toString())
    }

    fun onButtonClickDiv(v: View) {
        val firstNum: EditText = findViewById(R.id.firstNum)
        val secondNum: EditText = findViewById(R.id.secondNum)
        val result: TextView = findViewById(R.id.result)
        val num1: Double
        val num2: Double
        val res: Double
        num1 = Integer.parseInt(firstNum.text.toString()).toDouble()
        num2 = Integer.parseInt(secondNum.text.toString()).toDouble()
        if (num2 == 0.0)
            res = 0.0
        else
            res = (num1 / num2).toDouble()
        result.setText(res.toString())
    }
}