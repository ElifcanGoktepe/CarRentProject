package com.elifcan.carrentproject.repository;

import com.elifcan.carrentproject.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findAllByBrand(String brand);
    List<Car> findAllByColor(String color);
}
