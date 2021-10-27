package chair01;

public class Chair {
	private String style;
	private String color = "Blue";
	
	public void setstyle(String stl) { //setStyle can be named anything you want! Ex. Jeff
		style = stl;
	}
	
	public String getStyle() {// This is a getter
		return style;
	}
	public Chair(String stl) {
		style = stl;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	public static void main(String[] args) {
//		Chair mack = new Chair("Recliner");
//		System.out.println(mack.getStyle());
//		
//		Chair milly = new Chair("Rocking Chair");
//		System.out.println(milly.getStyle());
//		
//	}
	
	
}