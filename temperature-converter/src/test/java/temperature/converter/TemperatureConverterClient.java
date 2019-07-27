package temperature.converter;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface TemperatureConverterClient {

    @Named("temperature-converter")
    Single<Temperature> apply(@Body Temperature body);

}
