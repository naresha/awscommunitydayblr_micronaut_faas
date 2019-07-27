package com.nareshak.demo

import groovy.transform.Field

import javax.inject.Inject

@Field @Inject TemperatureConveterService temperatureConveterService

Temperature temperatureConverter(Temperature input) {
    println "Input: " + input
    def result = new Temperature(inFahrenheit:
            temperatureConveterService.celciusToFahrenheit(input.inCelcius))
    println result
    result
}