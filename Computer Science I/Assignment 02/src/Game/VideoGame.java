package Game;

public class VideoGame {
	private String style = "Playstation";
	private String color = "White";
	
	public void setstyle(String stl) { 
		style = stl;
	}
	
	public String getStyle() {
		return style;
	}
	public VideoGame(String stl) {
		style = stl;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}


