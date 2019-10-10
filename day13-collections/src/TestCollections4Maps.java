
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class TestCollections4Maps {

	public static void main(String[] args) {
		
		// select * from emp where empid = 123; fetch a row uniquely
		// word : synonyms 
		
		HashMap<String,String> map = new HashMap<>();
		map.put("Romeo","Juliet");
		map.put("Laila","Majnu");
		map.put("Heer", "Ranja");
		map.put("Jack","Rose");
		
		//System.out.println(map.get("Jack"));
		
		 // iterators = key, value and both key and value
		
		Set set = map.keySet(); // view
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			
			        System.out.println(iter.next());
		}
		
		Collection coll = map.values();  // views 
		iter = coll.iterator();
		while(iter.hasNext()){
			
	        System.out.println(iter.next());
}
		
		Set<Entry<String,String>>eset =    map.entrySet();
		
		iter = eset.iterator();
		while(iter.hasNext()){
			 Object obj = iter.next();
			 System.out.println(obj);
			
		}

	}

}
