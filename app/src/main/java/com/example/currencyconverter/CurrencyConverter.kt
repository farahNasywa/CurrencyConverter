package com.example.currencyconverter

class CurrencyConverter {

    private val rates = mapOf(
        "USD" to 0.000065,
        "EUR" to 0.000060,
        "JPY" to 0.0097
    )

    fun convert(idrAmount: Double, targetCurrency: String): Double {
        val rate = rates[targetCurrency] ?: throw IllegalArgumentException("Unsupported currency")
        return idrAmount * rate
    }
}
