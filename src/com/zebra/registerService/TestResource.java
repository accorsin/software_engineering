package com.zebra.registerService;

import com.zebra.registerService.commands.ProductQuery;
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
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Successful test (.../test/)";
	}
}
