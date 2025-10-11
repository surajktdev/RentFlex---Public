package com.rentflex.inventoryservice.service.impl;

import com.rentflex.inventoryservice.dto.ItemAvailabilityRequest;
import com.rentflex.inventoryservice.dto.ItemAvailabilityResponse;
import com.rentflex.inventoryservice.service.ItemAvailabilityService;
import org.springframework.stereotype.Service;

@Service
public class ItemAvailabilityServiceImpl implements ItemAvailabilityService {
    @Override
    public ItemAvailabilityResponse setItemAvailability(ItemAvailabilityRequest availabilityRequest) {
        return null;
    }

    @Override
    public ItemAvailabilityResponse getAvailabilityByItem(Long itemId) {
        return null;
    }

    @Override
    public ItemAvailabilityResponse updateAvailability(Long availabilityId, ItemAvailabilityRequest availabilityRequest) {
        return null;
    }

    @Override
    public void deleteAvailability(Long availabilityId) {

    }
}
