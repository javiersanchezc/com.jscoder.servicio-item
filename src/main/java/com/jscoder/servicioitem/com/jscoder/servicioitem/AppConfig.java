package com.jscoder.servicioitem.com.jscoder.servicioitem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("clienteRest")
    public RestTemplate registrarRestemplate(){
        return new RestTemplate();

    }
}
