package org.eviac.blog.service;

import java.util.Optional;

import org.eviac.blog.model.Product;

public interface ProductService {

  public Product saveProduct(Product product);

  public Optional<Product> getProductById(int id);

  public Iterable<Product> listAllProducts();

  public void deleteProduct(int id);
}
