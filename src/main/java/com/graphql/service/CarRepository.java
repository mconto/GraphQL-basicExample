package com.graphql.service;


import com.graphql.domain.Car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
