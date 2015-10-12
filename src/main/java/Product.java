import org.npc.dataaccess.model.BaseModel;
import org.npc.dataaccess.repository.BaseRepositoryInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;


@SuppressWarnings("unused")
public class Product extends BaseModel<Product> {

	private UUID id;
	private String description;
	private int lookupCode;
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

	protected Product(BaseRepositoryInterface repository) {
		super(repository);
	}

	protected Product(UUID id, BaseRepositoryInterface repository) {
		super(id, repository);
	}

	public UUID getId() {
		return id;
	}

	public BaseModel setId(UUID id) {
		this.id = id;
		return this;
	}

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
		this.setId((UUID) rs.getObject(ProductFieldNames.ID));
		this.setDescription(rs.getString(ProductFieldNames.DESCRIPTION));
		this.setLookupCode(rs.getInt(ProductFieldNames.LOOKUP_CODE));
		this.setPrice(rs.getDouble(ProductFieldNames.PRICE));
		this.setItemType(rs.getInt(ProductFieldNames.ITEM_TYPE));
		this.setCost(rs.getDouble(ProductFieldNames.COST));
		this.setQuantity(rs.getInt(ProductFieldNames.QUANTITY));
		this.setReorderPoint(rs.getInt(ProductFieldNames.REORDER_POINT));
		this.setRestockLevel(rs.getInt(ProductFieldNames.RESTOCK_LEVEL));
		this.setParentItem((UUID) rs.getObject(ProductFieldNames.PARENT_ITEM));
		this.setExtendedDescription(rs.getString(ProductFieldNames.EXTENDED_DESCRIPTION));
		this.setActiveStatus(rs.getBoolean(ProductFieldNames.ACTIVE_STATUS));
		this.setMsrp(rs.getDouble(ProductFieldNames.MSRP));
		this.setDateCreated(rs.getDate(ProductFieldNames.DATE_CREATED));
	}

	@Override
	protected Map<String, Object> fillRecord(Map record) {
		return null;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLookupCode() {
		return lookupCode;
	}

	public void setLookupCode(int lookupCode) {
		this.lookupCode = lookupCode;
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