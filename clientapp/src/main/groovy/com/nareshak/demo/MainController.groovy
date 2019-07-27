package com.nareshak.demo

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject

@Controller
class MainController {
    @Inject
    TemperatureConverter temperatureConverter

    @Get("/")
    String index() {
        def temperature = new Temperature(inCelcius: 37)
        Temperature result = temperatureConverter.convertTemperature(temperature)
                .blockingGet()
        result.toString()
    }
}
