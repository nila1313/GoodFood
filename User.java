package Goodfood;

public class User {
	int userId;
	String userName;
	
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", getUserId()=" + getUserId() + ", getUserName()="
				+ getUserName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public void showInformation(){
		System.out.println("Employee Id: "+getUserId());
		System.out.println("EmployeeName: "+getUserName());
	}

}
