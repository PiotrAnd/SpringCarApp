package com.example.CarApp.controllers;

import com.example.CarApp.model.Car50a;
import com.example.CarApp.services.Car50aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
public class Car50aController {
    @Autowired
    private Car50aService car50aService;


    @RequestMapping("/cars50a")
    public String getCar50a(Model model){
        model.addAttribute("cars50a", car50aService.listAllCars50a());
        return "cars50a";
    }

    @RequestMapping("/car50a/{id}")
    public String showCar50a(@PathVariable Integer id, Model model) {
        Optional<Car50a> car50aOpt = car50aService.getCar50aById(id);
        car50aOpt.ifPresent(car50a -> model.addAttribute("car50a", car50a));
        return "car50a";
    }

    @RequestMapping("/car50a/delete/{id}")
    public String deleteCar50a(@PathVariable Integer id){
        car50aService.deleteCar50a(id);
        return "redirect:/cars50a";
    }

    @RequestMapping("/car50a/edit/{id}")
    public String editCar50a(@PathVariable Integer id, Model model){
        model.addAttribute("car50a", car50aService.getCar50aById(id));
        return "car50aForm";
    }

    @RequestMapping("/car50a/new")
    public String newCar50a(Model model){
        model.addAttribute("car50a", new Car50a());
        return "car50aForm";
    }


    @PostMapping("/car50a")
    public String saveOrUpdateCar50a(Car50a car50a) {
        car50aService.saveOrUpdateCar50a(car50a);
        return "redirect:/cars50a/";
    }
}
