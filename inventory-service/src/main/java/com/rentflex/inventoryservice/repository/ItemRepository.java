package com.rentflex.inventoryservice.repository;

import com.rentflex.inventoryservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
