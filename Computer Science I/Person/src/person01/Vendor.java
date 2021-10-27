package person01;

public class Vendor extends Person {

	private String Company = "no company";

	public Vendor(String vendor) {
		Company = vendor;
	}
	
	public String getCompany() {
		return Company;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}
	
	public String getInfo() {
		return super.getInfo() +"--->"+ Company ;

	}

}
