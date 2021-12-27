package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.Booking;
import com.codejam.inventoryservice.enitity.CarItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

    @Query("from Booking where CarItem.id=?1 AND booking_status in('Completed','Initiated') AND fromDate>=current_date")
    public List<Booking> findBookingByCar(Long carId);

}
