package chair01;

public class ChairTest {

	public static void main(String[] args) {
		Chair Blob = new Chair("pokadot");
		
		
		Chair Lala = new Chair("Bean Bag");
		System.out.println(Lala.getStyle());
		System.out.println(Lala.getColor());
		
		Lala.setstyle("Rolling");
		Lala.setColor("Rainbow");
		
		System.out.println("Lala:" + Lala.getStyle());
		System.out.println("Lala:" + Lala.getColor());
		
		System.out.println("Blob:" + Blob.getStyle());
		System.out.println("Blob:" + Blob.getColor());
	}

}
