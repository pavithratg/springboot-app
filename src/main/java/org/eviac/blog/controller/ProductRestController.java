package org.eviac.blog.controller;

import java.util.Optional;

import org.eviac.blog.model.Product;
import org.eviac.blog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {
		productService.saveProduct(product);
		return "Product Saved!";
	}

	@RequestMapping("product/{id}")
	public Optional<Product> showProduct(@PathVariable Integer id) {
		return productService.getProductById(id);
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public Iterable<Product> list(Model model) {
		return productService.listAllProducts();

	}

	@RequestMapping("product/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		productService.getProductById(id);
		return "Product Chnaged!";

	}

	@RequestMapping("product/delete/{id}")
	public String delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return "Product Deleted!";
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
