package com.codejam.inventoryservice.InventoryDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class SearchRequest {

    private Date toDate;
    private Date fromDate;
    private String modelType;
    private String brand;

}
