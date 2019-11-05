package Goodfood;

public class Employee extends User  {
     
	private String employeeRank;

	public Employee(int userId, String userName, String employeeRank) {
		super(userId, userName);
		this.employeeRank=employeeRank;
		
	}

	public String getEmployeeRank() {
		return employeeRank;
	}

	public void setEmployeeRank(String employeeRank) {
		this.employeeRank = employeeRank;
	}


	public String toString() {
		return "Employee [userId=" + userId + ", userName=" + userName + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public void showInformation(){
		super.showInformation();
		System.out.println("Employee Rank:" +getEmployeeRank());
}

}
