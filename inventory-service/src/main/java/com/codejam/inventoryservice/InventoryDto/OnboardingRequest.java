package com.codejam.inventoryservice.InventoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnboardingRequest {
    private String CarImageUrl;
    private String Vehicle_no;
    private String CarBrand;
    private Long Category;
    private String Model;
    private String FuelType;
    private Long GarageId;

}
