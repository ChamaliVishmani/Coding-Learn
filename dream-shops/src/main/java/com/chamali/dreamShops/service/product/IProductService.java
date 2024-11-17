package com.chamali.dreamShops.service.product;

import com.chamali.dreamShops.dto.ProductDto;
import com.chamali.dreamShops.model.Product;
import com.chamali.dreamShops.request.AddProductRequest;
import com.chamali.dreamShops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest request, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getCOnvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
