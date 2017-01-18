package anno.model;

import org.springframework.stereotype.Component;

@Component
public class Supplier {

	private int supplierId=2222;
	private String name = "Supply All Ltd";
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + "]";
	}

	
}
