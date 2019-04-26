package com.jstk.demo;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDto> findCarsCheaperThanGivenPrice(int price) {

        List<Car> result = carRepository.findCheaperThan(price);

        List<CarDto> filteredResult = result.stream().map(entity -> new CarDto(entity.getBrand(), entity.getModel(), entity.getPrice())).collect(Collectors.toList());

        return filteredResult;
    }

}
