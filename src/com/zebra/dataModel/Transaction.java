package com.zebra.dataModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

import org.npc.dataaccess.model.BaseModel;

public class Transaction extends BaseModel<Transaction>{

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
		this.recordID = UUID.fromString(rs.getString(TransactionFieldNames.ID));
		this.cashierID = UUID.fromString(rs.getString(TransactionFieldNames.CASHIER_ID));
		this.parentID = UUID.fromString(rs.getString(TransactionFieldNames.PARENT_ID));
		this.amount = rs.getDouble(TransactionFieldNames.AMOUNT);
		this.transactionType = rs.getString(TransactionFieldNames.TRANSACTION_TYPE);	
		this.timeStamp = rs.getDate(TransactionFieldNames.DATE_CREATED);
		/*TODO: Add query for all T_Entries with the same TransactionID as this recordID*/
	}
	
	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
		record.put(TransactionFieldNames.ID, this.recordID);
		record.put(TransactionFieldNames.CASHIER_ID, this.cashierID);
		record.put(TransactionFieldNames.PARENT_ID, this.parentID);
		record.put(TransactionFieldNames.AMOUNT, this.amount);
		record.put(TransactionFieldNames.TRANSACTION_TYPE, this.transactionType);
		record.put(TransactionFieldNames.DATE_CREATED, this.timeStamp);
		/*TO DO: Add */ 
		return record;
	}


    private UUID recordID;
    private UUID cashierID;
    private UUID parentID;
    private double amount;
    private String transactionType;
    private Date timeStamp;
    private ArrayList<TransactionEntry> entryList;

    public Transaction() {
        super(new TransactionRepository());
    }

    /*public Transaction(UUID Record_ID, UUID Cashier_ID, UUID Parent_ID, double Amount, String Transaction_Type, Date Time_Stamp) {
        this.recordID = Record_ID;
        this.cashierID = Cashier_ID;
        this.parentID = Parent_ID;
        this.amount = Amount;
        this.transactionType = Transaction_Type;
        this.timeStamp = Time_Stamp;
    }*/


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

    public void setTimeStamp(java.sql.Date newTime_Stamp) {
        this.timeStamp = newTime_Stamp;
    }
    
    @Override
	public String toString() {
    	StringBuilder allEntries = new StringBuilder();
    	Iterator<TransactionEntry> iterator = entryList.iterator();
    	
    	TransactionEntry curr;
    	while (iterator.hasNext()){
    		curr = iterator.next();
    		allEntries.append(curr.toString());
    	}
    	
		return "Transaction{" +
				"recordID=" + recordID +
				", cashierID='" + cashierID + '\'' +
				", parentID=" + parentID +
				", amount=" + amount +
				", transactionType=" + transactionType +
				", timeStamp=" + timeStamp +
				allEntries +
				'}';
	}

}

