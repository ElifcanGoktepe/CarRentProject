package com.elifcan.carrentproject.service;

import com.elifcan.carrentproject.dto.request.DoRegisterRequestDto;
import com.elifcan.carrentproject.entity.Car;
import com.elifcan.carrentproject.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;

    public List<Car> getAll(){
        return repository.findAll();
    }

    public Car doRegister(DoRegisterRequestDto dto){
        Car car = Car.builder()
                .brand(dto.brand())
                .model(dto.model())
                .color(dto.color())
                .fuelType(dto.fuelType())
                .build();
        repository.save(car);
        return car;
    }

    public List<Car> getCarByBrand(String brand){
        return repository.findAllByBrand(brand);
    }

    public List<Car> getCarByColor(String color){
        return repository.findAllByColor(color);
    }

}
