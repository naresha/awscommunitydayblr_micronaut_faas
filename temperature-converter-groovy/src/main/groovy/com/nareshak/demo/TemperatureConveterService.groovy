package com.nareshak.demo

import javax.inject.Singleton

@Singleton
class TemperatureConveterService {
    double celciusToFahrenheit(double celcius) {
        celcius * 9 / 5 + 32
    }
}
