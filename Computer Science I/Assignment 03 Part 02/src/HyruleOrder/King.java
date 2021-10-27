package HyruleOrder;

public class King {
	private String name;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return name;
	}
	public King() {
		name = "no name";
	}
	public King(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		King kin = new King("King Rhoam");
		System.out.println(kin.getInfo());
		
		Princess pri = new Princess("Postage: Hyrule Castle");
		pri.setName("Zelda");
		System.out.println(pri.getInfo());
		
		RoyalKnight roy = new RoyalKnight("Hyrule Security");
		roy.setName("Link");
		System.out.println(roy.getInfo());
		
		Shiekah shi = new Shiekah("Prophecy");
		shi.setName("Impa");
		System.out.println(shi.getInfo());
		

	}

}
