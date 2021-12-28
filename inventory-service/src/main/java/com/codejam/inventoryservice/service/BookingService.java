package com.codejam.inventoryservice.service;

import com.codejam.inventoryservice.InventoryDto.BookingRequest;
import com.codejam.inventoryservice.InventoryDto.BookingResponse;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    public BookingResponse bookAnAsset(BookingRequest bookingRequest) {
        //Check availability

        //If available Lock the car

        //If blocked then proceed to payment

        //If payment success

        //Update the booking status to booked

        //Generate an invoice & return success with booking ID
        return BookingResponse.builder().build();
    }
}
