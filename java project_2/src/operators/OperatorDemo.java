package operators;

public class OperatorDemo {

	public static void main(String[] args) {

		System.out.println(20/3);
		System.out.println(20%3);
		determine3Divisibility(5);
		determine3Divisibility(33);
		
		String s = "10";
		int x = 10;
		System.out.println(s+1);
		System.out.println(x+1);
	}
	
	public static void determine3Divisibility(int x){
		if(x%3 == 0){
			System.out.println(x+" is divisble by 3");
		}else{
			System.out.println(x+" is not divisble by 3");
		}
	}
}
