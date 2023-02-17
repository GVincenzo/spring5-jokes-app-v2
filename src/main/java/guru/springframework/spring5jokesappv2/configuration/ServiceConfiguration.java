package guru.springframework.spring5jokesappv2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ServiceConfiguration {

    @Bean
    public ChuckNorrisQuotes quoteGenerator() {
        return new ChuckNorrisQuotes();
    }

}
