package com.example.currencyconverter

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val converter = CurrencyConverter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.inputAmount)
        val spinner = findViewById<Spinner>(R.id.currencySpinner)
        val button = findViewById<Button>(R.id.btnConvert)
        val result = findViewById<TextView>(R.id.resultText)

        val currencies = listOf("USD", "EUR", "JPY")
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, currencies)

        button.setOnClickListener {
            val amount = input.text.toString().toDoubleOrNull() ?: 0.0
            val currency = spinner.selectedItem.toString()
            val converted = converter.convert(amount, currency)
            result.text = "Hasil: %.2f %s".format(converted, currency)
        }
    }
}
