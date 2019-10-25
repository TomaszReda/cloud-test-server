package pl.cloud.test.coonfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limites")
public class Configuration {
    private int minimum;
    private int maximum;
}
