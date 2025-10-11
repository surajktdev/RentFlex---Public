package com.rentflex.inventoryservice.service.impl;

import com.rentflex.inventoryservice.dto.ItemRequest;
import com.rentflex.inventoryservice.dto.ItemResponse;
import com.rentflex.inventoryservice.model.Item;
import com.rentflex.inventoryservice.repository.ItemRepository;
import com.rentflex.inventoryservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;


    @Override
    public ItemResponse createItem(ItemRequest itemRequest) {
        return null;
    }

    @Override
    public List<ItemResponse> getAllItems() {
        return null;
    }

    @Override
    public ItemResponse getItemById(Long itemId) {
        return null;
    }

    @Override
    public ItemResponse getItemsByVendor(Long vendorId) {
        return null;
    }

    @Override
    public ItemResponse updateItem(Long itemId, ItemRequest itemRequest) {
        return null;
    }

    @Override
    public void deleteItem(Long itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        itemRepository.deleteById(item.getId());

    }

    @Override
    public ItemResponse updateItemAvailability(Long itemId, Boolean available) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        item.setAvailable(available);
        Item save = itemRepository.save(item);
        return ItemResponse.builder().id(save.getId()).name(save.getName()).message("Item availability updated successfully.").build();
    }

    @Override
    public ItemResponse searchItems(String keyword, Long categoryId, String location, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public ItemResponse getAvailableItems() {
        return null;
    }
}
