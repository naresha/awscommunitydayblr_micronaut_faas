package com.nareshak.demo

import io.micronaut.function.client.FunctionClient
import io.micronaut.http.annotation.Body
import io.reactivex.Single

import javax.inject.Named

@FunctionClient
interface TemperatureClient extends TemperatureConverter {

    @Override
    @Named("temperature-converter-mn-groovy")
    Single<Temperature> convertTemperature(@Body Temperature input)
}