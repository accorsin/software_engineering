package com.zebra.registerService.commands;

import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;

import java.util.UUID;

public class ProductQuery implements ResultCommandInterface<Product> {
	@Override
	public Product execute() {
		Product product = new Product();
		try {
			product = new Product(this.productRepository.get(this.productId));
		}
		catch (Exception e) {
			product = null;
		}
		return product;
	}

	public Product executeByLookUpCode() {
		Product product = new Product();
		try {
			product = new Product(this.productRepository.getByLookUpCode(this.lookUpCode));
		}
		catch (Exception e) {
			product = null;
		}
		return product;
	}

	//Properties
	private UUID productId;
	public UUID getProductId() {
		return this.productId;
	}
	public ProductQuery setProductId(UUID productId) {
		this.productId = productId;
		return this;
	}

	private String lookUpCode;
	public String getLookUpCode() {
		return this.lookUpCode;
	}
	public ProductQuery setLookUpCode(String lookUpCode) {
		this.lookUpCode = lookUpCode;
		return this;
	}
	
	private ProductRepositoryInterface productRepository;
	public ProductRepositoryInterface getProductRepository() {
		return this.productRepository;
	}
	public ProductQuery setProductRepository(ProductRepositoryInterface productRepository) {
		this.productRepository = productRepository;
		return this;
	}
}