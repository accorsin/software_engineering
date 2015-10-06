import java.util.UUID;

public class TransactionEntry {

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

}

