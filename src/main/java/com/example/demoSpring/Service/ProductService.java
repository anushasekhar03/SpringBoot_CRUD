package com.example.demoSpring.Service;

import com.example.demoSpring.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon", 80000),
            new Product(103, "Samsung", 70000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProductId() == prodId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Product not found with ID: " + prodId));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == prod.getProductId())
                index = i;
            products.set(index, prod);
        }
    }

    public void deleteProducts(int prodId) {
        int index = IntStream.range(0, products.size())
                .filter(i -> products.get(i).getProductId() == prodId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Product not found with ID: " + prodId));

        products.remove(index); // Remove the product by index
    }


}
