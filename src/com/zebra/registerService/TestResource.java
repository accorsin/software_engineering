package com.zebra.registerService;

import com.zebra.dataModel.TransactionRepository;
import com.zebra.registerService.commands.ProductQuery;
import com.zebra.registerService.commands.TransactionQuery;
import org.glassfish.jersey.server.ResourceConfig;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.repositories.ProductRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;


@Path("/")
public class TestResource extends ResourceConfig {

	@GET
	@Path("apiv0/product/{productid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("productid") UUID productId) {

		ProductQuery productQuery = new ProductQuery();
		ProductRepository productRepository = new ProductRepository();

		productQuery.setProductRepository(productRepository);
		productQuery.setProductId(productId);

		return productQuery.execute();
	}

	@GET
	@Path("apiv0/productByLookUpCode/{lookUpCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductByLookUpCode(@PathParam("lookUpCode") String lookUpCode) {

		ProductQuery productQuery = new ProductQuery();
		ProductRepository productRepository = new ProductRepository();

		productQuery.setProductRepository(productRepository);
		productQuery.setLookUpCode(lookUpCode);

		return productQuery.executeByLookUpCode();
	}

	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Successful test (.../test/)";
	}

	@GET
	@Path("acceptTransaction/{amount}")
	public boolean acceptTransaction(@PathParam("amount") String amount) {

		double doubleAmount;
		try {
			doubleAmount = Double.parseDouble(amount);


			TransactionQuery transactionQuery = new TransactionQuery();
			TransactionRepository transactionRepository = new TransactionRepository();

			transactionQuery.setTransactionRepository(transactionRepository);
			transactionQuery.setAmount(doubleAmount);

			transactionQuery.save();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
