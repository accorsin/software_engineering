package com.zebra.registerService.commands;

import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.apache.commons.lang3.StringUtils;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.enums.ProductApiRequestStatus;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;

import java.util.UUID;

public class CreateProductCommand implements ResultCommandInterface<Product> {
	@Override
	public Product execute() {
		if (StringUtils.isBlank(this.apiProduct.getLookupCode())) {
			return (new Product()).setApiRequestStatus(ProductApiRequestStatus.INVALID_INPUT);
		}
		
		org.npc.testmodel.models.Product modelProduct = this.productRepository.byLookupCode(this.apiProduct.getLookupCode());
		if (modelProduct != null) {
			return (new Product()).setApiRequestStatus(ProductApiRequestStatus.LOOKUP_CODE_ALREADY_EXISTS);
		}
		
		this.apiProduct.setId(UUID.randomUUID());
		modelProduct = new org.npc.testmodel.models.Product(this.apiProduct);
		modelProduct.save();

		return this.apiProduct;
	}

	//Properties
	private Product apiProduct;
	public Product getApiProduct() {
		return this.apiProduct;
	}
	public CreateProductCommand setApiProduct(Product apiProduct) {
		this.apiProduct = apiProduct;
		return this;
	}
	
	private ProductRepositoryInterface productRepository;
	public ProductRepositoryInterface getProductRepository() {
		return this.productRepository;
	}
	public CreateProductCommand setProductRepository(ProductRepositoryInterface productRepository) {
		this.productRepository = productRepository;
		return this;
	}
}