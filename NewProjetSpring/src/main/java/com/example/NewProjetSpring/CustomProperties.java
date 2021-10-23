package com.example.NewProjetSpring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.example.newprojetspring")
@Data
public class CustomProperties {

    private String apiUrl;

}