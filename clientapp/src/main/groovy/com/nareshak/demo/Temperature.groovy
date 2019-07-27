package com.nareshak.demo

import groovy.transform.ToString

@ToString
class Temperature implements Serializable {
    Double inCelcius
    Double inFahrenheit
}
