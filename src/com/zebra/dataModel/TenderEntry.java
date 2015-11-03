package com.zebra.dataModel;

import java.util.Date;
import java.util.UUID;


@SuppressWarnings("unused")
public class TenderEntry extends org.npc.testmodel.models.Product {

	public enum tender{
		CASH, GIFTCARD, MASTERCARD, VISA, DISCOVER, AMEX, DEBIT
	}

	private UUID recordID;
	private UUID transactionID;
	private tender tenderType;
	private double amount;
	private Date created;

	public TenderEntry() {
	}

	public TenderEntry(UUID id) {
		super(id);
	}

	public UUID getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(UUID transactionID) {
		this.transactionID = transactionID;
	}

	public tender getTenderType() {
		return tenderType;
	}

	public void setTenderType(tender tenderType) {
		this.tenderType = tenderType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "TenderEntry{" +
				"recordID=" + recordID +
				", transactionID='" + transactionID +
				", tenderType=" + tenderType +
				", amount=" + amount +
				", created=" + created +
				'}';
	}
}