package com.example.currencyconverter

import org.junit.Assert.*
import org.junit.Test

class CurrencyConverterTest {

    private val converter = CurrencyConverter()

    /* Test konversi dari IDR ke USD */
    @Test
    fun testConvertToUSD() {
        val result = converter.convert(100000.0, "USD")
        assertEquals(6.5, result, 0.1)
    }

    /* Test jika mata uang tidak didukung, maka harus melempar error */
    @Test(expected = IllegalArgumentException::class)
    fun testUnsupportedCurrency() {
        converter.convert(50000.0, "GBP")
    }
}
