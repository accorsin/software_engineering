package com.zebra.dataModel;

<<<<<<< HEAD
import java.util.UUID;

public class TransactionEntry {
=======
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import org.npc.dataaccess.model.BaseModel;
/*import org.npc.testmodel.models.fieldnames.ProductFieldNames;*/
/*import org.npc.testmodel.repositories.ProductRepository;*/


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
>>>>>>> a08bfe839880c248a435f5aed0da5a8bb4dd440a

    private UUID recordID;
    private UUID transactionID;
    private UUID productID;
    private double price;
    private int quantity;

    public TransactionEntry() {
        super();
    }

    public TransactionEntry(
            UUID Record_ID, UUID Transaction_ID, UUID Product_ID, double Price, int Quantity) {
        this.recordID = Record_ID;
        this.transactionID = Transaction_ID;
        this.productID = Product_ID;
        this.price = Price;
        this.quantity = Quantity;
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
    
    @Override
	public String toString() {
		return "TransactionEntry{" +
				"recordID=" + recordID +
				", transactionID='" + transactionID + '\'' +
				", productID=" + productID +
				", price=" + price +
				", quantity=" + quantity +
				'}';
	}
}

