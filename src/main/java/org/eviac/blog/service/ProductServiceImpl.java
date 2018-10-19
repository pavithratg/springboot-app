package org.eviac.blog.service;

import java.util.Optional;

import org.eviac.blog.model.Product;
import org.eviac.blog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Optional<Product> getProductById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public Iterable<Product> listAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);

	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
