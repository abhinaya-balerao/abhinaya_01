package flowcontrol;

import fundamentals.Flat;

public class FlowControlDemo {

	public static void main(String[] args) {
		
		String trafficColor="red";
		
		switch(trafficColor){
		case "Green":
			System.out.println("You can go");
			break;
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Get Ready");
			break;
		default:
			System.out.println("Not a valid color");
		}
	}
}
		
		/*for(int i = 1; i<=10; i++){
			if(i == 5)
				break;
			System.out.println(i);
		}
		
		int[] marks = {45, 47, 32};
		
		for(int i =0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		
		
		for(int mark:marks){
			System.out.println(mark);
		}
		//System.out.println(marks);
		
		Flat f1 = new Flat("Raj", 34000, 5);
		
		System.out.println(f1.owner);
		//System.out.println(f1.rent);
		//System.out.println(f1.members);
	}*/


