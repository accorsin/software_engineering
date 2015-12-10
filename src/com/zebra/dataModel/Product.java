package com.zebra.dataModel;

import java.util.Date;
import java.util.UUID;


@SuppressWarnings("unused")
public class Product extends org.npc.testmodel.models.Product {

	private UUID id;
	private String description;
	private String lookupCode;
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

	public Product() {
	}

	public Product(UUID id) {
		super(id);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", description='" + description + '\'' +
				", lookupCode=" + lookupCode +
				", price=" + price +
				", itemType=" + itemType +
				", cost=" + cost +
				", quantity=" + quantity +
				", reorderPoint=" + reorderPoint +
				", restockLevel=" + restockLevel +
				", parentItem=" + parentItem +
				", extendedDescription='" + extendedDescription + '\'' +
				", activeStatus=" + activeStatus +
				", MSRP=" + MSRP +
				", dateCreated=" + dateCreated +
				'}';
	}
}