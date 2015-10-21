package com.zebra.dataModel;

import org.npc.testmodel.repositories.ProductRepository;
import org.npc.testmodel.models.Product;

import java.util.UUID;

public class ProductTest {

	public static void main(String[] args) {

		UUID id = UUID.fromString("ed5c1fa9-803c-4208-bf09-654f00200516");

		ProductRepository repository = new ProductRepository();

		Product product = repository.get(id);

		System.out.println(product);

		System.out.println(repository.exists(id));

	}
}
