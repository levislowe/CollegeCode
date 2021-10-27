package person01;

public class Customer extends Person {
	
	private String phoneNumber = "no number";

	public Customer(String phone) {
		phoneNumber = phone;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getInfo() {
		return super.getInfo() +"--->"+ phoneNumber;
		
		
	}

}
