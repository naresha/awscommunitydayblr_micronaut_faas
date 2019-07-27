package temperature.converter;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Introspected
public class Temperature {
    private double inCelcius;
    private double inFahrenheit;

    public static Temperature ofCelcius(double celcius) {
        Temperature temperature = new Temperature();
        temperature.setInCelcius(celcius);
        return temperature;
    }

    public static Temperature ofFahrenheit(double fahrenheit) {
        Temperature temperature = new Temperature();
        temperature.setInFahrenheit(fahrenheit);
        return temperature;
    }
}
