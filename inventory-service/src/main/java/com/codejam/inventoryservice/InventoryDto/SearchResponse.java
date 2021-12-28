package com.codejam.inventoryservice.InventoryDto;

import com.codejam.inventoryservice.enitity.CarItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SearchResponse {

    private List<CarItem> availableCars;
}
