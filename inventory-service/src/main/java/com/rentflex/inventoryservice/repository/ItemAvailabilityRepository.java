package com.rentflex.inventoryservice.repository;

import com.rentflex.inventoryservice.model.ItemAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemAvailabilityRepository extends JpaRepository<ItemAvailability, Long> {
}
