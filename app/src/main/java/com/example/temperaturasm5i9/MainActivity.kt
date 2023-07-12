package com.example.temperaturasm5i9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun celsiusToFahrenheit(celsius: Double): Double {
    return (9 / 5 * celsius) + 32
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return (5 / 9 * (fahrenheit - 32)) + 273.15
}

fun main() {
    print("Ingrese una temperatura: ")
    val temperatura = readLine()?.toDoubleOrNull()

    if (temperatura != null) {
        println("Seleccione la conversión deseada:")
        println("1. Convertir desde Kelvin")
        println("2. Convertir desde Fahrenheit")
        println("3. Convertir desde Celsius")
        print("Ingrese la opción: ")
        val opcion = readLine()?.toIntOrNull()

        if (opcion != null && opcion in 1..3) {
            when (opcion) {
                1 -> {
                    val kelvin = temperatura
                    val celsius = kelvinToCelsius(kelvin)
                    val fahrenheit = celsiusToFahrenheit(celsius)

                    println("Temperatura ingresada: ${String.format("%.2f", kelvin)} K")
                    println("Equivalente en Celsius: ${String.format("%.2f", celsius)} °C")
                    println("Equivalente en Fahrenheit: ${String.format("%.2f", fahrenheit)} °F")
                }
                2 -> {
                    val fahrenheit = temperatura
                    val celsius = (fahrenheit - 32) * 5 / 9
                    val kelvin = fahrenheitToKelvin(fahrenheit)

                    println("Temperatura ingresada: ${String.format("%.2f", fahrenheit)} °F")
                    println("Equivalente en Celsius: ${String.format("%.2f", celsius)} °C")
                    println("Equivalente en Kelvin: ${String.format("%.2f", kelvin)} K")
                }
                3 -> {
                    val celsius = temperatura
                    val fahrenheit = celsiusToFahrenheit(celsius)
                    val kelvin = celsius + 273.15

                    println("Temperatura ingresada: ${String.format("%.2f", celsius)} °C")
                    println("Equivalente en Fahrenheit: ${String.format("%.2f", fahrenheit)} °F")
                    println("Equivalente en Kelvin: ${String.format("%.2f", kelvin)} K")
                }
            }
        } else {
            println("Opción inválida.")
        }
    } else {
        println("El valor ingresado no es válido.")
    }
}

