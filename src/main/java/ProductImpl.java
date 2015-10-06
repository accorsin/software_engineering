import org.npc.testmodel.models.Product;

import java.util.Date;
import java.util.UUID;

@SuppressWarnings("unused")
public class ProductImpl extends Product {

    private UUID productId;
    private String description;
    private int itemLookupCode;
    private double price;
    private int itemType;
    private double cost;
    private int quantity;
    private int reorderPoint;
    private int restockLevel;
    private UUID parentItem;
    private String extendedDescription;
    private boolean activeStatus;
    private double MSRP;
    private Date dateCreated;

    public ProductImpl() {
        super();
    }

    public ProductImpl(UUID productId, String description, int itemLookupCode, double price, int itemType, double cost,
                       int quantity, int reorderPoint, int restockLevel, UUID parentItem, String extendedDescription,
                       boolean activeStatus, double MSRP, Date dateCreated) {

        this.productId = productId;
        this.description = description;
        this.itemLookupCode = itemLookupCode;
        this.price = price;
        this.itemType = itemType;
        this.cost = cost;
        this.quantity = quantity;
        this.reorderPoint = reorderPoint;
        this.restockLevel = restockLevel;
        this.parentItem = parentItem;
        this.extendedDescription = extendedDescription;
        this.activeStatus = activeStatus;
        this.MSRP = MSRP;
        this.dateCreated = dateCreated;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemLookupCode() {
        return itemLookupCode;
    }

    public void setItemLookupCode(int itemLookupCode) {
        this.itemLookupCode = itemLookupCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(int reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public int getRestockLevel() {
        return restockLevel;
    }

    public void setRestockLevel(int restockLevel) {
        this.restockLevel = restockLevel;
    }

    public UUID getParentItem() {
        return parentItem;
    }

    public void setParentItem(UUID parentItem) {
        this.parentItem = parentItem;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public double getMsrp() {
        return MSRP;
    }

    public void setMsrp(double msrp) {
        MSRP = msrp;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}