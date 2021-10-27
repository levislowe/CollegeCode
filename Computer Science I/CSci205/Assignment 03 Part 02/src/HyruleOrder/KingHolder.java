package HyruleOrder;

public class KingHolder {
	
	private King person1;
	private King person2;
	private King person3;
	private King person4;
	private King person5;
	public static void main(String[] atgs) {
		Princess pri1 = new Princess("Hyrule Castle");
		pri1.setName("Zelda");
		
		RoyalKnight roy1 = new RoyalKnight("Hyrule Security");
		roy1.setName("Link");
		
		Shiekah shi1 = new Shiekah("Information");
		shi1.setName("Impa");
		
		Princess pri2 = new Princess("Lorule Castle");
		pri2.setName("Hilda");
		
		RoyalKnight roy2 = new RoyalKnight("Lorule Security");
		roy2.setName("Ravio");
		
		KingHolder group1 = new KingHolder();
		group1.setPerson1(pri1);
		group1.setPerson2(roy1);
		group1.setPerson3(shi1);
		group1.setPerson4(pri2);
		group1.setPerson5(roy2);
		group1.listAll();
		
	}
	public void listAll() {
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		System.out.println(person3.getInfo());
		System.out.println(person4.getInfo());
		System.out.println(person5.getInfo());
		
	}
	public King getPerson1() {
		return person1;
	}
	public void setPerson1(King person1) {
		this.person1 = person1;
	}
	public King getPerson2() {
		return person2;
	}
	public void setPerson2(King person2) {
		this.person2 = person2;
	}
	public King getPerson3() {
		return person3;
	}
	public void setPerson3(King person3) {
		this.person3 = person3;
	}
	public King getPerson4() {
		return person4;
	}
	public void setPerson4(King person4) {
		this.person4 = person4;
	}
	public King getPerson5() {
		return person5;
	}
	public void setPerson5(King person5) {
		this.person5 = person5;
	}

}


