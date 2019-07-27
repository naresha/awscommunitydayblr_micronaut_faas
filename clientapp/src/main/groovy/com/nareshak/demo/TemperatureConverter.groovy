package com.nareshak.demo

import io.micronaut.http.annotation.Body
import io.reactivex.Single

interface TemperatureConverter {
    Single<Temperature> convertTemperature(@Body Temperature input)

}