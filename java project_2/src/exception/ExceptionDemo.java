package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	String ss;
	public static void main(String[] args) {
		//System.out.println(5/0);
		
		/*int[] a = {34,235,54};
		int i = a[5];*/
		System.out.println("start");
		m1();
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/*try{
			System.out.println("try starts");
			System.out.println(3/3);
			System.out.println("try ends");
		}catch(Exception e){
			System.out.println("Caught exception");
			e.printStackTrace();
		}finally{
			System.out.println("finally called");
		}*/
		System.out.println("Result found ");
	}
	
	public static void m2() throws FileNotFoundException{
		m3();
		System.out.println("m2 started");
		System.out.println("m2 ends");
	}
	public static void m3() throws FileNotFoundException{
		System.out.println("m3 started");
		System.out.println("m3 ends");
		m4();
		
	}
	public static void m4() throws FileNotFoundException{
		
		System.out.println("m4 started");
		File f = new File("resources/Information.txt");
		
		Scanner sc =  new Scanner(f);
		
		System.out.println("m4 ends");
	}
	
	public static void m1(){
		System.out.println("m1 started");
		try {
			m2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("m1 ends");
	}

}
