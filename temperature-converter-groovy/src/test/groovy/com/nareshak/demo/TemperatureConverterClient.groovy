package com.nareshak.demo

import io.micronaut.function.client.FunctionClient
import io.micronaut.http.annotation.Body
import io.reactivex.Single

import javax.inject.Named

@FunctionClient
interface TemperatureConverterClient {

    @Named("temperature-converter")
    Single<Temperature> convertTemperature(@Body Temperature input)
}
