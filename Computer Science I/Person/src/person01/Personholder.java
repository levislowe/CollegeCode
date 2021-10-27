package person01;

public class Personholder {
	
	private Person person1;
	private Person person2;
	private Person person3;
	private Person person4;
	private Person person5;
	public static void main(String[] atgs) {
		Customer cust1 = new Customer("999 999 9999");
		cust1.setName("Fred Derf");
		
		Employee emp1 = new Employee("Cheif Cook");
		emp1.setName("Chef Fred");
		
		Vendor vend1 = new Vendor("CyberFood");
		vend1.setName("Fred Gnu");
		
		Customer cust2 = new Customer("777 777 7777");
		cust2.setName("Fred Shopper");
		
		Employee emp2 = new Employee("Chief Bottle Washer");
		emp2.setName("Fred Bottleman");
		
		Personholder group1 = new Personholder();
		group1.setPerson1(cust1);
		group1.setPerson2(emp1);
		group1.setPerson3(vend1);
		group1.setPerson4(cust2);
		group1.setPerson5(emp2);
		group1.listAll();
		
	}
	public void listAll() {
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		System.out.println(person3.getInfo());
		
	}
	public Person getPerson1() {
		return person1;
	}
	public void setPerson1(Person person1) {
		this.person1 = person1;
	}
	public Person getPerson2() {
		return person2;
	}
	public void setPerson2(Person person2) {
		this.person2 = person2;
	}
	public Person getPerson3() {
		return person3;
	}
	public void setPerson3(Person person3) {
		this.person3 = person3;
	}
	public Person getPerson4() {
		return person4;
	}
	public void setPerson4(Person person4) {
		this.person4 = person4;
	}
	public Person getPerson5() {
		return person5;
	}
	public void setPerson5(Person person5) {
		this.person5 = person5;
	}

}
