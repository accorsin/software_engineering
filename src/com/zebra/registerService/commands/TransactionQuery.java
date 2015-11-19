package com.zebra.registerService.commands;

import com.zebra.dataModel.TransactionRepositoryInterface;
import com.zebra.registerService.commands.interfaces.ResultCommandInterface;
import org.npc.testmodel.api.Transaction;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class TransactionQuery implements ResultCommandInterface<Transaction> {
	@Override
	public Transaction execute() {
		Transaction transaction = new Transaction();
		try {
			transaction = new Transaction(this.transactionRepository.get(this.recordId));
		} catch (Exception e) {
			transaction = null;
		}
		return transaction;
	}

	public void save() {
		com.zebra.dataModel.Transaction transaction = new com.zebra.dataModel.Transaction();
		transaction.setAmount(this.amount);

		Date date = new Date(System.currentTimeMillis());
		transaction.setTimeStamp(date);

		ArrayList<com.zebra.dataModel.Transaction> transactions = new ArrayList<>();
		transactions.add(transaction);
		this.transactionRepository.saveMany(transactions);
	}

	//Properties
	private UUID recordId;

	public UUID getRecordId() {
		return this.recordId;
	}

	public TransactionQuery setRecordId(UUID recordId) {
		this.recordId = recordId;
		return this;
	}

	private double amount;

	public double getAmount() {
		return this.amount;
	}

	public TransactionQuery setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	private TransactionRepositoryInterface transactionRepository;

	public TransactionRepositoryInterface getTransactionRepository() {
		return this.transactionRepository;
	}

	public TransactionQuery setTransactionRepository(TransactionRepositoryInterface transactionRepository) {
		this.transactionRepository = transactionRepository;
		return this;
	}
}