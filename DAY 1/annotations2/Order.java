package anno.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {

	private int orderId;
	
	@Autowired
	private Customer customer;
	
	@Autowired
	@Qualifier("item1")
	private Item item1;
	
	@Autowired
	@Qualifier("item2")
	private Item item2;
	
	
	
	private float amount;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item getItem1() {
		return item1;
	}
	public void setItem1(Item item1) {
		this.item1 = item1;
	}
	public Item getItem2() {
		return item2;
	}
	public void setItem2(Item item2) {
		this.item2 = item2;
	}
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer
				+ ", item1=" + item1 + ", item2=" + item2 + ", amount="
				+ amount + "]";
	}
}