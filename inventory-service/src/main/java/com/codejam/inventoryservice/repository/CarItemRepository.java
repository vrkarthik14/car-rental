package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.CarItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarItemRepository extends JpaRepository<CarItem,Integer>{


   @Query("from CarItem where CarItem.car.id=?1")
    public List<CarItem> findCarsbyCarTpe(Long carId);


    CarItem findByVehicleNumber(String vehicle_no);
}

