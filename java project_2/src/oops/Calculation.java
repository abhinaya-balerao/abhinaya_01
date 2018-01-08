package oops;

public class Calculation {
	
	public int add(int a, int b){
		System.out.println("two interger method");
		return a+b;
	}
	
	public double add(int a, double b){
		System.out.println("interger double method");
		return a+b;
	}
	
	public int add(int a, int b, int c){
		System.out.println("three interger method");
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(4, 9);
		cal.add(5, 2.3);
		cal.add(4, 8, 7);
	}

}
