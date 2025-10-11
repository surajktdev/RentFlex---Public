package com.rentflex.inventoryservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ItemResponse {
    private Long id;
    private Long vendorId;
    private String name;
    private String description;
    private Double pricePerDay;
    private Boolean available;
    private String location;
    private Long categoryId;
    private List<ItemAvailabilityResponse> availabilityList;
    private String message;
}
