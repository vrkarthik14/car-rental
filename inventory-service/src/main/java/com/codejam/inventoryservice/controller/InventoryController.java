package com.codejam.inventoryservice.controller;

import com.codejam.inventoryservice.InventoryDto.OnboardingRequest;
import com.codejam.inventoryservice.InventoryDto.OnboardingResponse;
import com.codejam.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory-service")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/onboardCar")
    public OnboardingResponse OnboardingCar(OnboardingRequest request){
        OnboardingResponse onboardingResponse = inventoryService.onboardNewCar(request);
        return onboardingResponse;
    }

    @GetMapping("/searchCar")
    public String SearchCar(OnboardingRequest request){
        inventoryService.onboardNewCar(request);
        return "Successfully onboarded!!!";
    }
}
