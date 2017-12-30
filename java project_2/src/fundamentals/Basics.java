package fundamentals;

public class Basics {

	int b;
	public static void main(String[] args) {
		
		/*int a;
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
		System.out.println(s1.equals(s3));*/
		
		/*int[] x;
		
		x = new int[4];
		
		int[] y = new int[5];
		y[0] = 4;
		y[2]=3;
		y[3] = 532;
		y[4] = 52311;
		y[1] = -234;
		
		int[] z = {4,-234, 3, 532, 52311};
		
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		
		for(int i = 0;i<y.length;i++){
			System.out.println(y[i]);
		}
		
		for(int i = 0;i<z.length;i++){
			System.out.println(z[i]);
		}*/
		
		String[][] names = {{"Rohan","Priya"},{"Sai","Rayaan"},{"Ashu","Anita"}};
		System.out.println(names.length);
		
		for(int i =0;i<names.length;i++){
			String[] names1d = names[i];
			for(int j=0;j<names1d.length;j++){
				System.out.print(names1d[j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++){
			for(int j =0;j<2;j++){
				System.out.print(names[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public void xyz(){
		System.out.println(b);
		//System.out.println(a);
	}

	
	
	
}
