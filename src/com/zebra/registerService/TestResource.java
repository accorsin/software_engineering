package com.zebra.registerService;

import com.zebra.registerService.commands.ProductQuery;
import com.zebra.dataModel.Transaction;
import com.zebra.dataModel.TransactionEntry;
import com.zebra.dataModel.TransactionRepository;
import com.zebra.dataModel.TransactionEntryRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.repositories.ProductRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;


@Path("/")
public class TestResource  extends ResourceConfig {
	
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
	@Path("api0/transaction/{transactionid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Transaction getTransaction(@PathParam("transactionid") UUID transactionId){
		TransactionQuery transactionQuery = new TransactionQuery();
		TransactionRepository transactionRepository = new TransactionRepository();
		
		transactionQuery.setTransactionRepository(transactionRepository);
		transactionQuery.setTransactionId(transactionId);
		
		return transactionQuery.execute();
	}
	
	@GET
	@Path("api0/transaction/{transactionentryid}")
	@Produces(MediaType.APPLICATION_JSON)
	public TransactionEntry getTransactionEntry(@PathParam("transactionentryid") UUID transactionEntryId){
		TransactionEntryQuery transactionEntryQuery = new TransactionEntryQuery();
		TransactionEntryRepository transactionEntryRepository = new TransactionEntryRepository();
		
		transactionEntryQuery.setTransactionEntryRepository(transactionEntryRepository);
		transactionEntryQuery.setTransactionEntryId(transactionEntryId);
		
		return transactionEntryQuery.execute();
	}
	
	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Successful test (.../test/)";
	}
}
