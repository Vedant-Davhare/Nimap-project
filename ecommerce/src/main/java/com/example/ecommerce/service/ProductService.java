// ProductService.java
package com.example.ecommerce.service;

import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.dto.ProductResponseDto;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<ProductResponseDto> getAllProducts(int page);
    ProductResponseDto getProductById(Long id);
    ProductResponseDto createProduct(ProductDto productDto);
    ProductResponseDto updateProduct(Long id, ProductDto productDto);
    void deleteProduct(Long id);
}