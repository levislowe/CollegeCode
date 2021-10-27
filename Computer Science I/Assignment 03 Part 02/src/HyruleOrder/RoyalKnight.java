package HyruleOrder;

public class RoyalKnight extends King {
	
	private String jobTitle = "no threat";

	public RoyalKnight(String title) {
		jobTitle = title;
	}
	
	public String getjobTitle() {
		return jobTitle;
	}

	public void settitler(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getInfo() {
		return super.getInfo() +"--->"+ jobTitle;
	}

}
