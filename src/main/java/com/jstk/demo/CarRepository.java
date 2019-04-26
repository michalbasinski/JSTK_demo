package com.jstk.demo;

import java.util.List;

public interface CarRepository {
    List<Car> findCheaperThan(int price);
}
