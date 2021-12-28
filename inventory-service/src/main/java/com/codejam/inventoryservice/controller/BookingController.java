package com.codejam.inventoryservice.controller;

import com.codejam.inventoryservice.InventoryDto.BookingRequest;
import com.codejam.inventoryservice.InventoryDto.BookingResponse;
import com.codejam.inventoryservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory-service")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public BookingResponse book(BookingRequest bookingRequest){
        BookingResponse bookingResponse = bookingService.bookAnAsset(bookingRequest);
        return bookingResponse;
    }
}
