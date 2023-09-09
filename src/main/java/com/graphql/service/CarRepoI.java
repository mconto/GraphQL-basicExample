package com.graphql.service;


import com.graphql.domain.Car;

import java.util.List;

public interface CarRepoI{

    List<Car> obtainCars();
    Car obtainCarsById(String idRequest) throws Exception;
    Car insertCar(Car car);

}
