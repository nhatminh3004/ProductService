package com.example.product_service.restcontroller;

import com.example.product_service.entity.Product;
import com.example.product_service.repository.ProductRepository;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    @Autowired
    private ProductService productService;
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
//    @Cacheable(value = "color",key = "#id")
    @GetMapping("/product/{id}")
    public Product getProductByID(@PathVariable int id){
//        System.out.println("Load getColorByID from DB");
        return productService.getProductByID(id);
    }
    @PostMapping("/product")
    public Product addNewProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @PutMapping("/product")
//    @CachePut(value = "color",key = "#colorCurrent.colorID")
    public Product updateProduct(@RequestBody Product productCurrent){

        return productService.updateProduct(productCurrent);
    }
    @DeleteMapping("/product/{id}")
//    @CacheEvict(value = "color",allEntries = true)
    public String deleteProductByID(@PathVariable int id){
        return productService.deleteProductByID(id);
    }

}
