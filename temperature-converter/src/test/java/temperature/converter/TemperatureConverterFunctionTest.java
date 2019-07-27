package temperature.converter;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class TemperatureConverterFunctionTest {

    @Inject
    TemperatureConverterClient client;

    @Test
    public void testFunction() throws Exception {
        Temperature body = Temperature.ofCelcius(37.0);
        assertEquals(98.6, client.apply(body).blockingGet().getInFahrenheit());
    }
}
