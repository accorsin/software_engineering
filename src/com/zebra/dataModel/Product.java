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