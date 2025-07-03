package com.example.DemoProject.Demo.Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public engine engine(){
        return new engine();
    }
    @Bean(name = "myCar")
    public car car(engine engine){
        return new car(engine);
    }

}
