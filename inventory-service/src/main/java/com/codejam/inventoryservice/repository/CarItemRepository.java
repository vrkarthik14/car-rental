package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.CarItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarItemRepository extends JpaRepository<CarItem,Integer>{


   @Query("from CarItem where CarItem.car.id=?1")
    public List<CarItem> findCarsbyCarTpe(Long carId);

   @Query("from CarItem where CarItem.vehicleNumber=?1")
   public CarItem findByVehiclNo(String vehicle_no);

    @Query("from CarItem where CarItem.car.modelType=?1 AND CarItem.car.brand=?2")
  public List<CarItem> findAvailableCar(String modelType,String brand);
}

