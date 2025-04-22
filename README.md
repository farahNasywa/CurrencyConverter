
---

# 💱 Aplikasi Konversi Mata Uang

Aplikasi Android sederhana untuk mengonversi mata uang IDR (Rupiah) ke mata uang asing (USD, EUR, JPY). Proyek ini dibuat untuk memenuhi tugas **JUnit**.

## 📱 Fitur Aplikasi

- Mengonversi IDR ke mata uang asing pilihan
- Menggunakan `Spinner`, `EditText`, dan `TextView`
- Sudah dilengkapi **2 unit test lokal** dan **2 instrumented test (UI test)**

## 🧪 Unit Test Lokal

File: `CurrencyConverterTest.kt`

```kotlin
/* Test konversi dari IDR ke USD */
@Test
fun testConvertToUSD()

/* Test jika mata uang tidak didukung, maka harus melempar error */
@Test(expected = IllegalArgumentException::class)
fun testUnsupportedCurrency()
```

## 📱 Instrumented Test (UI)

File: `MainActivityTest.kt`

```kotlin
/* Test input angka dan pilih USD lalu tekan tombol konversi */
@Test
fun testConversionFlow()

/* Test hasil tetap muncul walaupun input kosong (default 0) */
@Test
fun testEmptyInputDefaultsToZero()
```

## 🛠 Teknologi yang Digunakan

- Kotlin
- Android SDK
- JUnit4
- Espresso (untuk UI Testing)

---

