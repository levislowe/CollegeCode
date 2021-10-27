package person01;

public class Employee extends Person {

	private String jobTitle = "no job";

	public Employee(String title) {
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
