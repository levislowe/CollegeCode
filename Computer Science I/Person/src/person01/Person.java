package person01;

public class Person {
	private String name;
	
	public void setName (String name) {
		this.name = name;
	}
	public static String type01 = "Person: ";			
	public String getInfo() {
		return name;
	}
	public Person() {
		name = "no name";
	}
	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person friends = new Person(type01 + "Jonah");
		System.out.println(friends.getInfo());
		
		Person custm = new Customer("111-111-1111");
		custm.setName("Jonah");
		System.out.println(custm.getInfo());
		
		Person employ = new Employee("Cyber Security");
		employ.setName("Jonah");
		System.out.println(employ.getInfo());
		
		Person com = new Vendor("Apple");
		com.setName("Jonah");
		System.out.println(com.getInfo());
		

	}

}
