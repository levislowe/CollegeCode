package TempConv;

public class TempConvertor {
	private double input1;
	private double output;
	
	public double getOutput() {
		return output;
	}
	public void setInput1(double input) {
		input1 = input;
	}
	public void convert() {
		output = (input1 - 32) * (5.0/9);
	}

}
