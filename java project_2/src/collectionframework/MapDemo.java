package collectionframework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> markDetails = new LinkedHashMap<String,Integer>();
		markDetails.put("English", 89);
		markDetails.put("Maths", 98);
		markDetails.put("Science", 95);
		markDetails.put("Social", 95);
		markDetails.put("Hindi", 97);
		
		Set<String> subjects = markDetails.keySet();
		Collection<Integer> values = markDetails.values();
		Set<Entry<String,Integer>> enties = markDetails.entrySet();
		
		//System.out.println("Maths"+"\t"+markDetails.get("Maths"));
		
		/*for(String sub: subjects){
			System.out.print(sub+"\t");
			System.out.println(markDetails.get(sub));
		}*/
		
		/*Iterator<String> subItr = subjects.iterator();
		while(subItr.hasNext()){
			String subject = subItr.next();
			System.out.println(subject+"\t"+markDetails.get(subject));
		}*/
		
		for(Entry<String,Integer> entry:enties){
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		Iterator<Entry<String,Integer>> entryItr = enties.iterator();
		while(entryItr.hasNext()){
			Entry<String,Integer> entry = entryItr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
	}

}
