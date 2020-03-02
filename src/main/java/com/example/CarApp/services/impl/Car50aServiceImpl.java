package com.example.CarApp.services.impl;

import com.example.CarApp.model.Car50a;
import com.example.CarApp.repo.Car50aRepository;
import com.example.CarApp.services.Car50aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Car50aServiceImpl implements Car50aService {

    @Autowired
    private Car50aRepository car50Repository;

//    private Map<Integer, Car50a> cars50a;

    @Override
    public List<Car50a> listAllCars50a() {
        List<Car50a> result = new LinkedList<>();
        car50Repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Car50a> getCar50aById(Integer id) {
        return car50Repository.findById(id);
    }

    @Override
    public Car50a saveOrUpdateCar50a(Car50a cars50a) {
        if (cars50a != null) {
            return car50Repository.save(cars50a);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }
    }

    @Override
    public void deleteCar50a(Integer id) {
        car50Repository.deleteById(id);

    }

}
