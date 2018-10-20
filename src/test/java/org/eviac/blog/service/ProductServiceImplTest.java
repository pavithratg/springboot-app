package org.eviac.blog.service;

import org.eviac.blog.model.Product;
import org.eviac.blog.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

public class ProductServiceImplTest {

	@Mock
	private ProductRepository repo;

	private ProductServiceImpl service;
	private Product product;
	private Product mockProduct;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		service = new ProductServiceImpl();
		product = new Product();
		mockProduct = new Product();
		mockProduct.setId(1);

	}

	@Test
	public void saveProduct_should_save_product() {
		service.setProductRepository(repo);
		when(repo.save(product)).thenReturn(mockProduct);
		Product productSaved = service.saveProduct(product);
		assertEquals(Double.valueOf(productSaved.getId()), Double.valueOf(1));

	}

	public ProductRepository getRepo() {
		return repo;
	}

	public void setRepo(ProductRepository repo) {
		this.repo = repo;
	}

	public ProductServiceImpl getService() {
		return service;
	}

	public void setService(ProductServiceImpl service) {
		this.service = service;
	}

}
