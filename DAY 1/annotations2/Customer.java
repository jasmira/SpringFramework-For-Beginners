package anno.model;

public class Customer {

	private int customerId;
	private String name;
	private String address;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", address=" + address + "]\n";
	}
	
	
	
}
