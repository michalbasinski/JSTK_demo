package com.jstk.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    public void findCarsCheaperThanGivenPrice() {
        //given
        final int price = 50000;
        final int expectedCount = 2;

        //when
        List<CarDto> result = carService.findCarsCheaperThanGivenPrice(price);

        //then
        Assert.assertEquals(expectedCount, result.size());
    }
}