package fundamentals;

public class Basics {

	int b;
	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		int x = 50;
		short s = (short)x;
		
		long l = x;
		
		String s1 = "Ram";
		String s2 = new String("Ram");
		String s3 = "Ram";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	
	public void xyz(){
		System.out.println(b);
		//System.out.println(a);
	}

	
	
	
}
