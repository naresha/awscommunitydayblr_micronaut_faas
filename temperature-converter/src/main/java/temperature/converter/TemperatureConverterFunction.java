package temperature.converter;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;

import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;


@FunctionBean("temperature-converter")
public class TemperatureConverterFunction /*extends FunctionInitializer*/
        implements Function<Temperature, Temperature> {

    @Override
    public Temperature apply(Temperature input) {
        return Temperature.ofFahrenheit(input.getInCelcius() * 9 / 5 + 32);
    }

    /*public static void main(String... args) throws IOException {
        TemperatureConverterFunction function =
                new TemperatureConverterFunction();
        function.run(args, (context) ->
                function.apply(context.get(Temperature.class)));
    }*/
}

