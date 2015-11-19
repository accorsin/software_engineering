package com.zebra.registerService;

import com.zebra.dataModel.TransactionEntryRepository;
import com.zebra.dataModel.TransactionRepository;
import com.zebra.registerService.commands.ProductQuery;
import com.zebra.registerService.commands.TransactionQuery;
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
public class AcceptTransaction extends ResourceConfig {

	/*@GET
	@Path("acceptTransaction/{amount}")
	@Produces(MediaType.APPLICATION_JSON)
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
	}*/
}
