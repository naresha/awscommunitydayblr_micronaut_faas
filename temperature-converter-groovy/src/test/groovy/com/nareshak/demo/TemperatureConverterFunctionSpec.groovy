package com.nareshak.demo

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class TemperatureConverterFunctionSpec extends Specification {

    @Inject
    TemperatureConverterClient client


    void "test temperature-converter-groovy function"() {
        given:
        Temperature temperature = new Temperature(inCelcius: 37)

        expect:
        client.convertTemperature(temperature).blockingGet().inFahrenheit == 98.6
    }
}
