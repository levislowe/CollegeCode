package calcdemo;

public class Calc2 {
	private double in1;
	private double in2;
	private double out;
	
	public double getout() {
		return out;
		
	}
	public void setIn2(double in2) {
		this.in2 = in2;
	}
	public void setIn1(double in1) {
		this.in1 = in1;
	}
	
	public void add() {
		out = in1 + in2;
	}
	public void subtract() {
		out = in1 - in2;
	}
	public void multiply() {
		out = in1 * in2;
	}
	public void divide() {
		out = in1 / in2;
	}
	
	public static void main(String[] args) {
		Calc2 c = new Calc2();	}

}
