package com.rentflex.inventoryservice.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ItemAvailabilityResponse {
    private Long id;
    private Long itemId;
    private LocalDate availableFrom;
    private LocalDate availableTo;
    private Boolean isAvailable;
    private String message;
}
