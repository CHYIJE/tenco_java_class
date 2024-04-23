package basic.ch16;

public class OverLoding {
	
	public int avg (int a, int b) {
		return a + b / 2;
	}
	public double avg (double a, double b) {
		return a + b / 2;
	}
	public float avg (float a, float b) {
		return a + b / 2;
	}
	///
	public int avg (int a, int b, int c) {
		return a + b + c / 3;
	}
	public double avg (double a, double b , double c) {
		return a + b + c / 3;
	}
	public float avg (float a, float b, float c) {
		return a + b + c / 3;
	}
	///
	
	
}
