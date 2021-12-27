package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Garage, Long> {
}
