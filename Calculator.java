public class Calculator {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.subtract(5, 3));
		System.out.println(calculator.multiply(10, 10));
		System.out.println(calculator.division(10, 2));
		System.out.println(calculator.modulus(10, 2));
	
	}
	//Method for addition
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//Method for Subtraction
	public int subtract(int x, int y) {
		int result = x - y;
		return result;
	}
	//Method for multiplication
	public int multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	
	//Method for division
	public double division(int x, int y) {
		double a = (double) x;
		double b = (double) y;
		double result = a / b;
		return result;
	}	
	//Method for modulus
	public int modulus(int x, int y) {
		int result = x % y;
		return result;
	}
	
}	