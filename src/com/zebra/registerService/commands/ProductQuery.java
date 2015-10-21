package com.zebra.registerService.commands;

import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;

import java.util.UUID;

public class ProductQuery implements ResultCommandInterface<Product> {
	@Override
	public Product execute() {
		return new Product(
			this.productRepository.get(this.productId)
		);
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
	
	private ProductRepositoryInterface productRepository;
	public ProductRepositoryInterface getProductRepository() {
		return this.productRepository;
	}
	public ProductQuery setProductRepository(ProductRepositoryInterface productRepository) {
		this.productRepository = productRepository;
		return this;
	}
}
