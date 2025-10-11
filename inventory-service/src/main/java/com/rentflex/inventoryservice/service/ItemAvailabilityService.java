package com.rentflex.inventoryservice.service;

import com.rentflex.inventoryservice.dto.ItemAvailabilityRequest;
import com.rentflex.inventoryservice.dto.ItemAvailabilityResponse;

public interface ItemAvailabilityService {
    ItemAvailabilityResponse setItemAvailability(ItemAvailabilityRequest availabilityRequest);

    ItemAvailabilityResponse getAvailabilityByItem(Long itemId);

    ItemAvailabilityResponse updateAvailability(Long availabilityId, ItemAvailabilityRequest availabilityRequest);

    void deleteAvailability(Long availabilityId);
}
