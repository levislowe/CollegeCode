package HyruleOrder;

public class Princess extends King {

	private String Postage = "no post";

	public Princess(String post) {
		Postage = post;
	}
	
	public String getPostage() {
		return Postage;
	}

	public void setPhoneNumber(String Postage) {
		this.Postage = Postage;
	}
	
	public String getInfo() {
		return super.getInfo() +"--->"+ Postage;
		

	}

}
