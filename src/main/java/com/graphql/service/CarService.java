package com.graphql.service;


import com.graphql.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarRepoI {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> obtainCars() {
         Iterable<Car> carIterable = carRepository.findAll();
        List<Car> car = new ArrayList<>();
        for (Car carI : carIterable){
            car.add(carI);
        }
        return car;
    }

    @Override
    public Car obtainCarsById(String idRequest) throws Exception {
        Integer id = Integer.parseInt(idRequest);
        return carRepository.findById(id).get();
    }

    @Override
    public Car insertCar(Car car){
        return carRepository.save(car);
    }
}
