package anno.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Item {

	private int itemId;
	private String itemName;
	
	@Autowired
	private Supplier supplier;
	private float quantity;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", supplier=" + supplier + ", quantity=" + quantity + "]\n";
	}
	
	
}
