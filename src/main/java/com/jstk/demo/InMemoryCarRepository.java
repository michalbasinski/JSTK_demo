package com.jstk.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryCarRepository implements CarRepository {

    List<Car> cars;

    public InMemoryCarRepository() {
        cars = new ArrayList<Car>();
        cars.add(new Car(1l, "Fiat", "Panda", 40000));
        cars.add(new Car(2l, "Ferrari", "Enzo", 1540000));
        cars.add(new Car(3l, "VW", "Polo", 45000));
    }

    @Override
    public List<Car> findCheaperThan(int price) {
        List<Car> result = cars.stream().filter(car -> car.getPrice() < price).collect(Collectors.toList());
        return result;
    }

}
