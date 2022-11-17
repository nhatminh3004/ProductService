package com.example.product_service.service;

import com.example.product_service.dto.Color;
import com.example.product_service.dto.ProductDto;
import com.example.product_service.entity.Product;
import com.example.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private RestTemplate restTemplate;
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductByID(int productID) {
        return productRepository.findById(productID).orElse(null);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public String deleteProductByID(int productID) {
        productRepository.deleteById(productID);
        return "Delete Success Product :" + productID;
    }

    @Override
    public Product updateProduct(Product productCurrent) {
        Product productKhiUpdate = new Product();
        productRepository.findById(productCurrent.getProductID()).ifPresent(productUpdate -> {
            productUpdate.setName(productCurrent.getName());
            productUpdate.setNewProduct(productCurrent.isNewProduct());
            productUpdate.setCategoryID(productCurrent.getCategoryID());
            productUpdate.setPrice(productCurrent.getPrice());
            productUpdate.setMoTa(productCurrent.getMoTa());
            productUpdate.setHightLight(productCurrent.isHightLight());
            productUpdate.setSoLuong(productCurrent.getSoLuong());

            productKhiUpdate.setName(productCurrent.getName());
            productKhiUpdate.setNewProduct(productCurrent.isNewProduct());
            productKhiUpdate.setCategoryID(productCurrent.getCategoryID());
            productKhiUpdate.setPrice(productCurrent.getPrice());
            productKhiUpdate.setMoTa(productCurrent.getMoTa());
            productKhiUpdate.setHightLight(productCurrent.isHightLight());
            productKhiUpdate.setSoLuong(productCurrent.getSoLuong());
            productRepository.save(productKhiUpdate);
        });
        return productKhiUpdate;
    }

    @Override
    public List<ProductDto> getProductDtoHightlight() {
        List<Product> productHithlight = productRepository.getProductHightlight();
        List<ProductDto> productDtosHithlight = new ArrayList<>();
        for (Product product : productHithlight) {
            ResponseEntity<Color[]> response = restTemplate.getForEntity("http://localhost:8003/api/getColorByProductId/" + product.getProductID(), Color[].class);
            List<Color> colors = Arrays.asList(response.getBody());
            for (Color color : colors) {
                 ProductDto productDto = new ProductDto(product.getProductID(), product.getName(), product.getPrice(), product.isHightLight(), product.isNewProduct(), product.getMoTa(), product.getSoLuong(), product.getCategoryID(), color.getColorID(), color.getName(), color.getCode());
                 productDtosHithlight.add(productDto);
            }
        }
        return productDtosHithlight;
    }
}
