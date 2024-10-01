package com.example.backendapp.services.Product;

import com.example.backendapp.Models.Product;
import com.example.backendapp.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProductById(long id) {

    }

    @Override
    public void updateProduct(Product product, long productId) {

    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String name, String brand) {
        return List.of();
    }

    @Override
    public long countProductsByBrandAndName(String brand, String name) {
        return 0;
    }
}
