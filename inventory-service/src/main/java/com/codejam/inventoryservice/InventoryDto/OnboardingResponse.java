package com.codejam.inventoryservice.InventoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OnboardingResponse extends GenericResponse {
    private String CarImageUrl;
    private String Vehicle_no;
    private String Car_Brand;
    private String Category;
    private String Model;
    private String FuelType;
    private String GarageId;
}
