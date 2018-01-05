package fundamentals;

public class Flat {

	public String owner;
	double rent;
	private int members;
	
	public Flat(String owner, double rent, int members){
		this.owner = owner;
		this.rent = rent;
		this.members = members;
	}
	
	public void addMember(){
		members = members+1;
	}
	
	public void deleteMember(){
		members = members-1;
		//clean();
	}
	
	public void clean(){
		System.out.println("Flat is cleaned for "+owner);
		//printHello();
	}
	
	public static void main(String[] args) {
		Flat f1 = new Flat("Raj", 34000, 5);
		
		System.out.println(f1.owner);
		System.out.println(f1.rent);
		System.out.println(f1.members);
		
		
		
		Flat f2 = new Flat("Shyam", 3000, 2);
		System.out.println(f2.rent);
		
		
		Flat f3 = new Flat("Anita", 4000, 1);
		System.out.println(f3.members);
		//printHello();
		//f3.clean();
	}
	
	public static void printHello(){
		System.out.println("Hello");
	}
	
	
}
