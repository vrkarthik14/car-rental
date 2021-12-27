package com.codejam.inventoryservice.service;

import com.codejam.inventoryservice.InventoryDto.OnboardingRequest;
import com.codejam.inventoryservice.InventoryDto.OnboardingResponse;
import com.codejam.inventoryservice.enitity.*;
import com.codejam.inventoryservice.repository.*;
import com.codejam.inventoryservice.utils.BUSINESS_CONSTANTS;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private GarageRepository garageRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarItemRepository carItemRepository;

    public OnboardingResponse onboardNewCar(OnboardingRequest request) {
        //Garage
        Garage garage = garageRepository.getOne(request.getGarageId());

        //Category
        Category category = categoryRepository.getOne(request.getCategory());

        //Brand
        Brand brand = brandRepository.findByBrandName(request.getCarBrand());
        if(null == brand)
            brandRepository.save(Brand.builder().
                    brandName(request.getCarBrand()).build());
        //Car
        Car car = carRepository.findByModel(request.getModel());
        if( null== car)
            carRepository.save(Car.builder().modelType(request.getModel()).build());

        //CarItem
        CarItem carItem = carItemRepository.findByVehicleNumber(request.getVehicle_no());
        if(null == carItem)
            carItemRepository.save(CarItem.builder()
                    .car(car)
                    .fuelType(request.getFuelType())
                    .garage(garage)
                    .status("Onboarded")
                    .vehicleNumber(request.getVehicle_no()).imageUrl(request.getCarImageUrl())
                    .build());
        OnboardingResponse onboardingResponse = OnboardingResponse.builder().build();
        BeanUtils.copyProperties(request, onboardingResponse);
        onboardingResponse.setResponseCode(String.valueOf(BUSINESS_CONSTANTS.SUCCESS.getValue()));
        return onboardingResponse;
    }


}
