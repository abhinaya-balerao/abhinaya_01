package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		Collection<String> ll = new ArrayList<String>();
		ll.add("John");
		ll.add("Rohan");
		ll.add("Sita");
		ll.add("Rohan");
		ll.add("Abhinaya");
		
		for(String str:ll){
			System.out.println(str);
		}
		System.out.println(ll.size());
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
