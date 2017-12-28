package fundamentals;

public class Flat {

	String owner;
	double rent;
	int members;
	
	public void addMember(){
		members = members+1;
	}
	
	public void deleteMember(){
		members = members-1;
	}
	
	public void clean(){
		System.out.println("Flat is cleaned for "+owner);
	}
	
	public static void main(String[] args) {
		Flat f1 = new Flat();
		f1.owner = "Raj";
		f1.rent = 34000;
		f1.members = 5;
		
		Flat f2 = new Flat();
		f2.members = 5;
		f2.owner = "Shyam";
		f2.members = 3;
		f2.rent = 2399.45;
		
		Flat f3 = new Flat();
		f3.owner = "Anita";
		f3.rent = 4000;
		f3.members = 1;
		
		
		//System.out.println(f2.rent);
		
		System.out.println(f1.members);
		f1.addMember();
		System.out.println(f1.members);
		System.out.println(f2.members);
		
	}
	
	
}
