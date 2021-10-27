package loop;

public class MillisDemo {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("Start Counting"+time);
		while( System.currentTimeMillis() < time + 3000);
		System.out.println("Stop Counting");
	}

}
