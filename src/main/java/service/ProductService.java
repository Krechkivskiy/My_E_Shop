package service;

import model.Product;

import java.util.Map;

public interface ProductService {
    void addProduct(Product product);

    Map<Integer, Product> getAll();

    void change(Product product);

    void deleteProduct(Integer key);
}
