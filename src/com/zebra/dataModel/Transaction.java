package com.zebra.dataModel;

import java.util.Date;
import java.util.UUID;

public class Transaction {

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

