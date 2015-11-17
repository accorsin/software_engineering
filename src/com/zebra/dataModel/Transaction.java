package com.zebra.dataModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.npc.dataaccess.model.BaseModel;
/*import org.npc.testmodel.models.fieldnames.ProductFieldNames;*/
/*import org.npc.testmodel.repositories.ProductRepository;*/

public class Transaction extends BaseModel<Product>{

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLExcepetion {
		this.recordID = rs.getUUID(TransactionFieldNames.ID);
		this.cashierID = rs.getUUID(TransactionFieldNames.CASHIER_ID);
		this.parentID = rs.getUUID(TransactionFieldNames.PARENT_ID);
		this.amount = rs.getDouble(TransactionFieldNames.AMOUNT);
		this.transactionType = rs.getString(TransactionFieldNames.TRANSACTION_TYPE);	
		this.timeStamp = rs.getTimestamp(TransactionFieldNames.DATE_CREATED).toLocalDateTime();
	}
	
	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
		record.put(TransactionFieldNames.ID, this.recordID);
		record.put(TransactionFieldNames.TRANSACTION_ID, this.transactionID);
		record.put(TransactionFieldNames.PRODUCT_ID, this.productID);
		record.put(TransactionFieldNames.PRICE, this.price);
		record.put(TransactionFieldNames.DATE_CREATED, Timestamp.valueOf(this.timeStamp));
		
		return record;
	}


    private UUID recordID;
    private UUID cashierID;
    private UUID parentID;
    private double amount;
    private String transactionType;
    private Date timeStamp;

    public Transaction() {
        super();
    }

    public Transaction(
            UUID Record_ID, UUID Cashier_ID, UUID Parent_ID, double Amount, String Transaction_Type, Date Time_Stamp) {
        this.recordID = Record_ID;
        this.cashierID = Cashier_ID;
        this.parentID = Parent_ID;
        this.amount = Amount;
        this.transactionType = Transaction_Type;
        this.timeStamp = Time_Stamp;
    }


    //Getters for each of the class values
    public UUID getRecordID() {
        return this.recordID;
    }

    //Setters for each of the class values
    public void setRecordID(UUID newRecord_ID) {
        this.recordID = newRecord_ID;
    }

    public UUID getCashierID() {
        return this.cashierID;
    }

    public void setCashierID(UUID newCashier_ID) {
        this.cashierID = newCashier_ID;
    }

    public UUID getParentID() {
        return this.parentID;
    }

    public void setParentID(UUID newParent_ID) {
        this.parentID = newParent_ID;
    }

    public double getAmount() {
        //Total amount owed
        return this.amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String newTransactionType) {
        this.transactionType = newTransactionType;
    }

    public Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Date newTime_Stamp) {
        this.timeStamp = newTime_Stamp;
    }

}

