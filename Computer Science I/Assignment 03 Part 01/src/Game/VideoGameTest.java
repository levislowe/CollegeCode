package Game;

import Game.VideoGame;

public class VideoGameTest {
	
	public static void main(String[] args) {
		VideoGame Mob = new VideoGame("Switch");
		Mob.setColor("Grey");
		
		VideoGame Call = new VideoGame("Playstation");
		System.out.println(Call.getStyle());
		System.out.println(Call.getColor());
		
		Call.setstyle("XBox");
		Call.setColor("Black");
		
		System.out.println("Microsoft:" + Call.getStyle());
		System.out.println("Pitch:" + Call.getColor());
		
		System.out.println("Nintendo:" + Mob.getStyle());
		System.out.println("Dark:" + Mob.getColor());
	}

}
