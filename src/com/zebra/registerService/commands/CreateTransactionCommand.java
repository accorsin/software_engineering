package com.zebra.registerService.commands;

import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.apache.commons.lang3.StringUtils;
import org.npc.testmodel.api.Product;
import org.npc.testmodel.enums.ProductApiRequestStatus;
import org.npc.testmodel.repositories.interfaces.ProductRepositoryInterface;
import com.zebra.dataModel.*;

import java.util.UUID;

public class CreateTransactionCommand implements ResultCommandInterface<Transaction> {
	@Override
	public Transaction execute() {
		/*if ((this.transaction.getId()== null)) {
			return (new Transaction()).setApiRequestStatus(TransactionApiRequestStatus.INVALID_INPUT);
		}*/
		
		Transaction modelTransaction = this.transactionRepository.byTransactionId(this.transaction.getId());
		/*if (modelTransaction != null) {
			return (new Transaction()).setApiRequestStatus(TransactionApiRequestStatus.LOOKUP_CODE_ALREADY_EXISTS);
		}*/
		
		/*this.transaction.setId();*/
		modelTransaction = new Transaction();
		modelTransaction.save();

		return this.transaction;
	}

	//Properties
	private Transaction transaction;
	public Transaction getApiTransaction() {
		return this.transaction;
	}
	public CreateTransactionCommand setApiTransaction(Transaction transaction) {
		this.transaction = transaction;
		return this;
	}
	
	private TransactionRepositoryInterface transactionRepository;
	public TransactionRepositoryInterface getTransactionRepository() {
		return this.transactionRepository;
	}
	public CreateTransactionCommand setTransactionRepository(TransactionRepositoryInterface transactionRepository) {
		this.transactionRepository = transactionRepository;
		return this;
	}
}