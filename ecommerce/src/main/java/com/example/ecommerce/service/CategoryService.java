// CategoryService.java
package com.example.ecommerce.service;

import com.example.ecommerce.dto.CategoryDto;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<CategoryDto> getAllCategories(int page);
    CategoryDto getCategoryById(Long id);
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(Long id, CategoryDto categoryDto);
    void deleteCategory(Long id);
}