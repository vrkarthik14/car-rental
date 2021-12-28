package com.codejam.inventoryservice.InventoryDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailRequest {
    public Date fromDate;
    public Date toDate;
    public int carItemId;
}
