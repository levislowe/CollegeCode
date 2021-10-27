package HyruleOrder;

public class Shiekah extends King {
	
	private String Prophecy = "no Prophecy";

	public Shiekah(String info) {
		Prophecy = info;
	}
	
	public String getProphecy() {
		return Prophecy;
	}

	public void Prophecy(String Prophecy) {
		this.Prophecy = Prophecy;
	}
	
	public String getInfo() {
		return super.getInfo() +"--->"+ Prophecy ;
	
	}


}
