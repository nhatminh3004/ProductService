package com.example.product_service.service;

import com.example.product_service.dto.ProductDto;
import com.example.product_service.entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public Product getProductByID(int productID);
    public List<Product> getAllProduct();
    public String deleteProductByID(int productID);
    public Product updateProduct(Product productCurrent);
    public List<ProductDto> getProductDtoHightlight();
}
