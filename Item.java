package Goodfood;

public class Item {

	private String foodName;
	private int foodPrice;
	private int foodQuantity;
	public Item(String foodName, int foodPrice, int foodQuantity) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodQuantity = foodQuantity;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	public String toString() {
		return "Item [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodQuantity=" + foodQuantity + "]";
	}
	
	
	
}
