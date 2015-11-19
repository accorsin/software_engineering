package com.zebra.dataModel;

import org.npc.dataaccess.model.BaseModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;


public class TransactionEntry extends BaseModel<TransactionEntry> {

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
		this.recordID = UUID.fromString(rs.getString(TransactionEntryFieldNames.ID));
		this.transactionID = UUID.fromString(rs.getString(TransactionEntryFieldNames.TRANSACTION_ID));
		this.productID = UUID.fromString(rs.getString(TransactionEntryFieldNames.PRODUCT_ID));
		this.price = rs.getDouble(TransactionEntryFieldNames.PRICE);
		this.quantity = rs.getInt(TransactionEntryFieldNames.QUANTITY);	
	}
	
	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
		record.put(TransactionEntryFieldNames.ID, this.recordID);
		record.put(TransactionEntryFieldNames.TRANSACTION_ID, this.transactionID);
		record.put(TransactionEntryFieldNames.PRODUCT_ID, this.productID);
		record.put(TransactionEntryFieldNames.PRICE, this.price);
		record.put(TransactionEntryFieldNames.QUANTITY, this.quantity);
		
		return record;
	}

    private UUID recordID;
    private UUID transactionID;
    private UUID productID;
    private double price;
    private int quantity;

	public TransactionEntry() {
		super(new TransactionEntryRepository());
	}

	public TransactionEntry(UUID id) {
		super(id, new TransactionEntryRepository());
	}

	public TransactionEntry(org.npc.testmodel.api.TransactionEntry apiTransactionEntry) {
		super(apiTransactionEntry.getRecordId(), new TransactionEntryRepository());
		this.recordID = apiTransactionEntry.getRecordId();
		this.transactionID = apiTransactionEntry.getTransactionID();
		this.productID = apiTransactionEntry.getProductID();
		this.price = apiTransactionEntry.getPrice();
		this.quantity = apiTransactionEntry.getQuantity();
	}

    //Getters for each of the class values
    public UUID getRecordID() {
        return this.recordID;
    }

    //Setters for each of the class values
    public void setRecordID(UUID newRecord_ID) {
        this.recordID = newRecord_ID;
    }

    public UUID getTransactionID() {
        return this.transactionID;
    }

    public void setTransactionID(UUID newTransaction_ID) {
        this.transactionID = newTransaction_ID;
    }

    public UUID getProductID() {
        return this.productID;
    }

    public void setProductID(UUID newProduct_ID) {
        this.productID = newProduct_ID;
    }

    public double getPrice() {
        //Note: Price per 1 unit quantity
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

}

