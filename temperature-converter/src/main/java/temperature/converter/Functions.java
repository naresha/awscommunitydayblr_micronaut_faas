package temperature.converter;

import io.micronaut.context.annotation.Factory;
import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@Factory
public class Functions {

    @FunctionBean("temperature-converter1")
    public Function<Temperature, Temperature> celciusToFahrenheit() {
        return (Temperature input) -> Temperature.ofFahrenheit(input.getInCelcius() * 9 / 5 + 32);
    }
}
