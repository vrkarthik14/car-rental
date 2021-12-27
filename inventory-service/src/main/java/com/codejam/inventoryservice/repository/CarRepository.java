package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByModel(String modelType);
}
