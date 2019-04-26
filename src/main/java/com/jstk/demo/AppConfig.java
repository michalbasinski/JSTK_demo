package com.jstk.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CarService carService(CarRepository carRepository) {
        return new CarService(carRepository);
    }

    @Bean
    CarRepository carRepository() {
        return new InMemoryCarRepository();
    }

}
