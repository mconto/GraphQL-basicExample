package com.graphql.controller;


import com.graphql.domain.Car;
import com.graphql.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @QueryMapping()
    public List<Car> obtainListCars(){
        return carService.obtainCars();
    }

    @QueryMapping()
    public Car obtainCarsById(@Argument String id) throws Exception {
        return carService.obtainCarsById(id);
    }

    @MutationMapping
    public Car saveCars(@Argument Car car){
        return carService.insertCar(car);
    }


}
