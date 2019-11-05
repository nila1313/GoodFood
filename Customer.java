package Goodfood;

public class Customer extends User {
	String customerPhoneNumber;

	public Customer(int userId, String userName, String customerPhoneNumber){
		super(userId, userName);
		this.customerPhoneNumber=customerPhoneNumber;
		
}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	@Override
	public String toString() {
		return  "Customer [customerPhoneNumber=" + customerPhoneNumber + ", userId=" + userId + ", userName=" + userName
				+ ", getCustomerPhoneNumber()=" + getCustomerPhoneNumber() + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public void showInformation(){
		super.showInformation();
		System.out.println("Customer phone number" +getCustomerPhoneNumber());
}
}