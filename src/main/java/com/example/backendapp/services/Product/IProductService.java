package com.example.backendapp.services.Product;

import com.example.backendapp.Models.Product;

import java.util.List;

public interface IProductService {

    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
    void deleteProductById(long id);
    void updateProduct(Product product,long productId);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String name,String brand);
    long countProductsByBrandAndName(String brand,String name);




}
