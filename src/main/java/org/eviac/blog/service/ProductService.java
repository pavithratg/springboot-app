package org.eviac.blog.service;

import java.util.List;
import org.eviac.blog.model.Product;

public interface ProductService {

  public void saveProduct(Product product);

  public Product getProductById(int id);

  public List<Product> listAllProducts();

  public void deleteProduct(int id);
}
