package com.example.CarApp.services;

import com.example.CarApp.model.Car50a;

import java.util.List;
import java.util.Optional;

public interface Car50aService {

    List<Car50a> listAllCars50a();

    Optional<Car50a> getCar50aById(Integer id);

    Car50a saveOrUpdateCar50a(Car50a car50a);

    void deleteCar50a(Integer id);
}
