package com.zebra.registerService.commands;

import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.api.ProductListing;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;

import java.util.stream.Collectors;

public class ProductsQuery implements ResultCommandInterface<ProductListing> {
	@Override
	public ProductListing execute() {
		return (new ProductListing()).
			setProducts(
				this.productRepository.all().stream().map(mp -> (new Product(mp))).collect(Collectors.toList()
			)
		);
	}

	//Properties
	private ProductRepositoryInterface productRepository;
	public ProductRepositoryInterface getProductRepository() {
		return this.productRepository;
	}
	public ProductsQuery setProductRepository(ProductRepositoryInterface productRepository) {
		this.productRepository = productRepository;
		return this;
	}
}
