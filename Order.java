package Goodfood;

public class Order {
       
	private int orderId;
	private int customerId;
	private int totalItems ;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", totalItems=" + totalItems + "]";
	}
}
