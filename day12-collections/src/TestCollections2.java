import java.util.HashSet;


public class TestCollections2 {

	public static void main(String[] args) {
		
		//Set implementations -  a collection of unique elements 
       // you cannot get elements - you can only check exists or not
		// you have to define what is unique
		
		Bill b1 = new Bill("J10201F","Jan2019");
		Bill b2 = new Bill("J10201G","Jan2019");
		Bill b3 = new Bill("J10201G","Jan2019");
		
		HashSet<Bill> set = new HashSet<>();
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
//	set.add("Hello");
	set.add(b1);
	set.add(b2);
	set.add(b3);
	System.out.println(set.size());
	}

}
