package com.codejam.inventoryservice.InventoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingResponse extends GenericResponse {
    public int userId;
    public Date fromDate;
    public Date toDate;
    public int carItemId;
}
