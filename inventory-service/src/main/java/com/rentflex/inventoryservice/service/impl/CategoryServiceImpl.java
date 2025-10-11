package com.rentflex.inventoryservice.service.impl;

import com.rentflex.inventoryservice.dto.CategoryRequest;
import com.rentflex.inventoryservice.dto.CategoryResponse;
import com.rentflex.inventoryservice.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public CategoryResponse createCategory(CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        return List.of();
    }

    @Override
    public CategoryResponse getCategoryById(Long categoryId) {
        return null;
    }

    @Override
    public CategoryResponse updateCategory(Long categoryId, CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryId) {

    }
}
